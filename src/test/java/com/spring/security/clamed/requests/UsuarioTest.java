package com.spring.security.clamed.requests;



import org.json.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

import java.net.URI;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestEntityManager
//@Transactional

public class UsuarioTest {

    private URI path;
    private MockHttpServletRequest request;
    private ResultMatcher expectedResult ;

    @Autowired
    private MockMvc mock;


    @Test
    public void testCadastrar() throws Exception{

        String json = "{\"login\": \"brunomoura\", \"senha\": \"102030\"}";
        path = new URI("/login");

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.post(path)
                .contentType(MediaType.APPLICATION_JSON).content(json);

        expectedResult = MockMvcResultMatchers.status().isOk();

        String response = mock.perform(request).andExpect(expectedResult).andReturn().getResponse()
                .getContentAsString();

         JSONObject data = new JSONObject(response);



         String jwtToken = data.getString("Authorization");
        // jwtToken.replace("Bearer","");
        //System.out.println("Token eh: "+jwtToken.replace("Bearer",""));

         String jsonCadastro = "{\"nome\": \"Usuario Teste\", \"login\": \"usuarioteste2\", \"senha\": \"usuarioteste\"}";

        path = new URI("/usuarios");

        request = MockMvcRequestBuilders.post(path).content(jsonCadastro).header("Content-Type", "application/json")
                .header("Authorization", jwtToken);

        expectedResult = MockMvcResultMatchers.status().isCreated();

        mock.perform(request).andExpect(expectedResult);




    }

}

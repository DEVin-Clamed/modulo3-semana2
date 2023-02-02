INSERT INTO public.role(nome_role) VALUES ('ROLE_ADMINISTRADOR');
INSERT INTO public.role(nome_role) VALUES ('ROLE_CADASTRADOR');

INSERT INTO public.usuario(login, nome, senha) VALUES ('brunomoura', 'Bruno Moura', '$2a$10$1/tzkPLEbpU/FQWKcp9C5u19nARxtc.3Zge8LPWkatj/ub922CAaa');

INSERT INTO public.usuarios_role(usuario_id, role_id) VALUES (1, 1);

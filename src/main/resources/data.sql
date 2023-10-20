/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  1513003
 * Created: 2 de mai. de 2023
 */

INSERT INTO organizacao (id, nome, sigla, organizacao_pai_id, created_at) VALUES
(1, 'Campus Naviraí', 'NV', null, now()),
(2, 'Coordenação do Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas', 'NV-COTAD', 1, now()),
(3, 'Coordenação do Curso Superior de Agronomia', 'NV-COBAG', 1, now()),
(4, 'Coordenação do Curso Técnico Integrado de Informática para Internet', 'NV-COINF', 1, now()),
(5, 'Coordenação do Curso Técnico Integrado de Agricultura', 'NV-COREN', 1, now());

ALTER SEQUENCE organizacao_sequence RESTART WITH 6;

INSERT INTO professor (id, nome, email) VALUES
(1, 'Nicholas', 'nicholas.santos@ifms.edu.br'),
(2, 'Laurentino', 'laurentino.dantas@ifms.edu.br');

ALTER SEQUENCE professor_seq RESTART WITH 3;

INSERT INTO curso (id, nome, created_at, campus_id) VALUES
(1, 'Agronomia', now(), 1),
(2, 'TADS', now(), 1);

ALTER SEQUENCE curso_sequence RESTART WITH 3;

INSERT INTO turma (id, nome, ano) VALUES
(1, 'TADS 3221', 2021),
(2, 'TADS 3222', 2022);

ALTER SEQUENCE turma_sequence RESTART WITH 3;

INSERT INTO periodo (id, nome, tipo_periodo, numero, ano, inicio, fim) VALUES
(1, 'Semestre 2023/1', 'SEMESTRAL', 1, 2023, '2023-02-07', '2023-07-04'),
(2, 'Semestre 2023/2', 'SEMESTRAL', 2, 2023, '2023-07-24', '2023-12-20');

ALTER SEQUENCE periodo_sequence RESTART WITH 3;

INSERT INTO disciplina (id, nome, carga_horaria, ementa, curso_id) VALUES
(1, 'Desenvolvimento para serviços Web 1', 80.0, 'Spring Boot', 2),
(2, 'Desenvolvimento para interfaces ricas', 80.0, 'React', 2);

ALTER SEQUENCE disciplina_sequence RESTART WITH 3;

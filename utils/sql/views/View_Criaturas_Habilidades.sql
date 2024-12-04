-- View que lista as Criaturas e suas Habilidades
CREATE VIEW vw_criatura_habilidades AS
SELECT 
    c.id AS id_criatura,
    c.nome AS nome_criatura,
    c.descricao AS descricao_criatura,
    h.nome AS nome_habilidade,
    h.descricao AS descricao_habilidade
FROM 
    criatura c
INNER JOIN 
    habilidade h
ON 
    c.habilidade_id = h.id;

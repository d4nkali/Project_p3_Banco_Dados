-- View que lista as Criaturas e seus Habitats
CREATE VIEW vw_criatura_habitats AS
SELECT 
    c.id AS id_criatura,
    c.nome AS nome_criatura,
    c.descricao AS descricao_criatura,
    h.nome AS nome_habitat,
    h.descricao AS descricao_habitat,
    h.clima AS clima_habitat
FROM 
    criatura c
INNER JOIN 
    habitat h
ON 
    c.habitat_id = h.id;

-- Lista a quantidade de Criaturas por Habitat em ordem decrescente
SELECT 
    h.id AS id_habitat,
    h.nome AS nome_habitat,
    h.clima AS clima_habitat,
    c.nome AS nome_monstro,
    c.classe AS classe_monstro
FROM 
    habitat h
LEFT JOIN 
    criatura c 
ON 
    h.id = c.habitat_id
ORDER BY 
	h.id DESC;

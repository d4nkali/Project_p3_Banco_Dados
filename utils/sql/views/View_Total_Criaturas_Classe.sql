-- View que conta a quantidade de Criaturas de cada classe
CREATE VIEW vw_total_criaturas_por_classe AS
SELECT 
    classe,
    COUNT(*) AS total
FROM 
    criatura c 
GROUP BY 
    classe;

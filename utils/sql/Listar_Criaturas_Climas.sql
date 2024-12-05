/*
Lista de Consultas das Criaturas em seus climas
*/
-- Consulta para listar os monstros que vivem no clima Úmido
SELECT * FROM vw_criatura_habitats WHERE clima_habitat = 'UMIDO';

-- Consulta para listar os monstros que vivem no clima Frio
SELECT * FROM vw_criatura_habitats WHERE clima_habitat = 'FRIO';

-- Consulta para listar os monstros que vivem no clima Polar
SELECT * FROM vw_criatura_habitats WHERE clima_habitat = 'POLAR';

-- Consulta para listar os monstros que vivem no clima Chuvoso
SELECT * FROM vw_criatura_habitats WHERE clima_habitat = 'CHUVOSO';

-- Consulta para listar os monstros que vivem no clima Árido
SELECT * FROM vw_criatura_habitats WHERE clima_habitat = 'ARIDO';

-- Consulta para listar os monstros que vivem no clima Neblinoso
SELECT * FROM vw_criatura_habitats WHERE clima_habitat = 'NEBLINOSO';

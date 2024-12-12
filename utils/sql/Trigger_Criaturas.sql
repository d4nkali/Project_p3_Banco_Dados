-- Trigger não usada para gerar histórico de modificação das criaturas
-- Função que será usada pela trigger
CREATE OR REPLACE FUNCTION gerar_historico_criaturas()
RETURNS TRIGGER AS $$
BEGIN
    -- Insere um novo registro no histórico com os dados antigos
    INSERT INTO public.historico_criaturas (
        id, 
        classe, 
        descricao, 
        nome,
		habilidade_id,
		habitat_id,
        data_modificacao
    )
    VALUES (
        OLD.id,
        OLD.classe,
        OLD.descricao,
        OLD.nome,
		OLD.habilidade_id,
		OLD.habitat_id,
        NOW()
    );
    RETURN NEW;
END;

$$ LANGUAGE plpgsql;

-- Trigger que chama a função após a atualização de um registro
CREATE TRIGGER trigger_historico_criaturas
AFTER UPDATE ON public.produtos
FOR EACH ROW
EXECUTE FUNCTION gerar_historico_criaturas();

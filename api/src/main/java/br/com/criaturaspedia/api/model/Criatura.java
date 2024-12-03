package br.com.criaturaspedia.api.model;

import br.com.criaturaspedia.api.enums.TipoClasse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Criatura {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;

	private String nome;

	@Column(columnDefinition = "TEXT")
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "habilidade_id")
	private Habilidade habilidade;

	@ManyToOne
	@JoinColumn(name = "habitat_id")
	private Habitat habitat;

	@Enumerated(EnumType.STRING)
	private TipoClasse classe;

}

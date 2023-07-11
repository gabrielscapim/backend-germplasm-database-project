package germplasm.database.api.model;

import germplasm.database.api.dto.DataAddGermplasmDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "germplasm")
@Entity(name = "Germplasm")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Germplasm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="deletado")
    private Boolean deletado;

    @Column(name="nome")
    private String nome;

    @Column(name="tipo_de_material_genetico")
    private String tipoDeMaterialGenetico;

    @Column(name = "textura_do_grao")
    private String texturaDoGrao;

    @Column(name = "origem")
    private String origem;

    @Column(name = "transgenico")
    private Boolean transgenico;

    @Column(name = "eventos_transgenicos")
    private String eventosTransgenicos;

    @Column(name = "local_na_camara_fria")
    private String localNaCamaraFria;

    @Column(name = "data_de_entrada")
    private String dataDeEntrada;

    @Column(name = "data_da_ultima_colheita")
    private String dataDaUltimaColheita;

    @Column(name = "colletotrichum_graminicola")
    private Float colletotrichumGraminicola;

    @Column(name = "puccinia_sorghi")
    private Float pucciniaSorghi;

    @Column(name = "exserohilum_turcicum")
    private Float exserohilumTurcicum;

    @Column(name = "phaeosphaeria_maydis")
    private Float phaeosphaeriaMaydis;

    @Column(name = "puccinia_polysora")
    private Float pucciniaPolysora;

    @Column(name = "physopella_zeae")
    private Float physopellaZeae;

    @Column(name = "corn_stunt")
    private Float cornStunt;

    @Column(name = "diplodia_maydis")
    private Float diplodiaMaydis;

    @Column(name = "fusarium_moniliforme")
    private Float fusariumMoniliforme;

    @Column(name = "gibberella_zeae")
    private Float gibberellaZeae;

    @Column(name = "altura_de_planta")
    private Float alturaDePlanta;

    @Column(name = "altura_de_espiga")
    private Float alturaDeEspiga;

    @Column(name = "diametro_da_espiga")
    private Float diametroDaEspiga;

    @Column(name = "numero_de_graos_por_fileira")
    private Float numeroDeGraosPorFileira;

    @Column(name = "numero_de_fileiras_de_graos_por_espiga")
    private Float numeroDeFileirasDeGraosPorEspiga;

    @Column(name = "comprimento_de_espigas")
    private Float comprimentoDeEspigas;

    @Column(name = "rendimento_de_graos")
    private Float rendimentoDeGraos;

    @Column(name = "capacidade_de_expansao")
    private Float capacidadeDeExpansao;

    @Column(name = "massa_de_cem_graos")
    private Float massaDeCemGraos;

    @Column(name = "numero_de_espigas")
    private Float numeroDeEspigas;

    @Column(name = "diametro_do_colmo")
    private Float diametroDoColmo;

    @Column(name = "comprimento_de_grao")
    private Float comprimentoDeGrao;

    @Column(name = "largura_de_grao")
    private Float larguraDeGrao;

    @Column(name = "espessura_de_grao")
    private Float espessuraDeGrao;

    @Column(name = "espessura_do_pericarpo")
    private Float espessuraDoPericarpo;

    @Column(name = "difusividade_termica_do_pericarpo")
    private Float difusividadeTermicaDoPericarpo;

    @Column(name = "teor_de_proteina")
    private Float teorDeProteina;

    @Column(name = "teor_de_oleo")
    private Float teorDeOleo;

    @Column(name = "amido_total")
    private Float amidoTotal;

    @Column(name="primeira_folha_pigmentacao_antocianinica_da_bainha")
    private Integer primeiraFolhaPigmentacaoAntocianinicaDaBainha;

    @Column(name="primeira_folha_forma_do_apice")
    private Integer primeiraFolhaFormaDoApice;

    @Column(name="folhagem_intensidade_da_cor_verde")
    private Integer folhagemIntensidadeDaCorVerde;

    @Column(name="folha_ondulacao_da_margem_da_lamina")
    private Integer folhaOndulacaoDaMargemDaLamina;

    @Column(name="folha_angulo_entre_a_lamina_e_o_colmo")
    private Integer folhaAnguloEntreALaminaEOColmo;

    @Column(name="folha_curvatura_da_lamina")
    private Integer folhaCurvaturaDaLamina;

    @Column(name="colmo_grau_do_zig_zag")
    private Integer colmoGrauDoZigZag;

    @Column(name="pendao_ciclo_ate_a_antese")
    private Integer pendaoCicloAteAAntese;

    @Column(name="pendao_pigmentacao_antocianinica_na_base_da_gluma")
    private Integer pendaoPigmentacaoAntocianinicaNaBaseDaGluma;

    @Column(name="pendao_pigmentacao_antocianinica_da_gluma_excluida_a_base")
    private Integer pendaoPigmentacaoAntocianinicaDaGlumaExcluidaABase;

    @Column(name="pendao_pigmentacao_antocianinica_das_anteras")
    private Integer pendaoPigmentacaoAntocianinicaDasAnteras;

    @Column(name="pendao_angulo_entre_o_eixo_principal_e_os_ramos_laterais")
    private Integer pendaoAnguloEntreOEixoPrincipalEOsRamosLaterais;

    @Column(name="pendao_curvatura_dos_ramos_laterais")
    private Integer pendaoCurvaturaDosRamosLaterais;

    @Column(name="pendao_numero_de_ramificacoes_primarias")
    private Integer pendaoNumeroDeRamificacoesPrimarias;

    @Column(name="espiga_ciclo_ate_o_aparecimento_dos_estigmas")
    private Integer espigaCicloAteOAparecimentoDosEstigmas;

    @Column(name="espiga_pigmentacao_antocianinica_dos_estigmas")
    private Integer espigaPigmentacaoAntocianinicaDosEstigmas;

    @Column(name="colmo_pigmentacao_antocianinica_das_raizes_aereas")
    private Integer colmoPigmentacaoAntocianinicaDasRaizesAereas;

    @Column(name="pendao_densidade_das_espiguetas")
    private Integer pendaoDensidadeDasEspiguetas;

    @Column(name="folha_pigmentacao_antocianinica_da_bainha")
    private Integer folhaPigmentacaoAntocianinicaDaBainha;

    @Column(name="colmo_pigmentacao_antocianinica_dos_entrenos")
    private Integer colmoPigmentacaoAntocianinicaDosEntrenos;

    @Column(name="pendao_comp_do_eixo_principal_acima_do_ramo_lateral_mais_baixo")
    private Integer pendaoCompDoEixoPrincipalAcimaDoRamoLateralMaisBaixo;

    @Column(name="pendao_comp_do_eixo_principal_acima_do_ramo_lateral_mais_alto")
    private Integer pendaoCompDoEixoPrincipalAcimaDoRamoLateralMaisAlto;

    @Column(name="pendao_comp_do_ramo_lateral")
    private Integer pendaoCompDoRamoLateral;

    @Column(name="planta_comp")
    private Integer plantaComp;

    @Column(name="planta_relacao_alt_ins_pedunculo_espiga_mais_alta_e_comp_planta")
    private Integer plantaRelacaoAltInsPedunculoEspigaMaisAltaECompPlanta;

    @Column(name="folha_largura_da_lamina")
    private Integer folhaLarguraDaLamina;

    @Column(name="pedunculo_comp")
    private Integer pedunculoComp;

    @Column(name="espiga_comp")
    private Integer espigaComp;

    @Column(name="espiga_diametro_no_meio_da_espiga")
    private Integer espigaDiametroNoMeioDaEspiga;

    @Column(name="espiga_forma")
    private Integer espigaForma;

    @Column(name="espiga_numero_de_fileiras_de_graos")
    private Integer espigaNumeroDeFileirasDeGraos;

    @Column(name="espiga_numero_de_cores_dos_graos")
    private Integer espigaNumeroDeCoresDosGraos;

    @Column(name="grao_intensidade_da_cor_amarela")
    private Integer graoIntensidadeDaCorAmarela;

    @Column(name="grao_comp")
    private Integer graoComp;

    @Column(name="grao_largura")
    private Integer graoLargura;

    @Column(name="espiga_tipo_de_grao")
    private Integer espigaTipoDeGrao;

    @Column(name="espiga_enrugamento_do_extremo_superior_do_grao")
    private Integer espigaEnrugamentoDoExtremoSuperiorDoGrao;

    @Column(name="espiga_cor_do_extremo_superior_do_grao")
    private Integer espigaCorDoExtremoSuperiorDoGrao;

    @Column(name="espiga_cor_do_lado_dorsal_do_grao")
    private Integer espigaCorDoLadoDorsalDoGrao;

    @Column(name="tipo_de_grao_estourado")
    private Integer tipoDeGraoEstourado;

    @Column(name="espiga_pigmentacao_antocianinica_das_glumas_do_sabugo")
    private Integer espigaPigmentacaoAntocianinicaDasGlumasDoSabugo;

    @Column(name="informacoes_adicionais")
    private String informacoesAdicionais;

    public Germplasm(DataAddGermplasmDTO dataAddGermplasmDTO) {
        this.deletado = false;
        this.nome = dataAddGermplasmDTO.nome();
        this.tipoDeMaterialGenetico = dataAddGermplasmDTO.tipoDeMaterialGenetico();
        this.texturaDoGrao = dataAddGermplasmDTO.texturaDoGrao();
        this.origem = dataAddGermplasmDTO.origem();
        this.transgenico = dataAddGermplasmDTO.transgenico();
        this.eventosTransgenicos = dataAddGermplasmDTO.eventosTransgenicos();
        this.localNaCamaraFria = dataAddGermplasmDTO.localNaCamaraFria();
        this.dataDeEntrada = dataAddGermplasmDTO.dataDeEntrada();
        this.dataDaUltimaColheita = dataAddGermplasmDTO.dataDaUltimaColheita();
        this.colletotrichumGraminicola = dataAddGermplasmDTO.colletotrichumGraminicola();
        this.pucciniaSorghi = dataAddGermplasmDTO.pucciniaSorghi();
        this.exserohilumTurcicum = dataAddGermplasmDTO.exserohilumTurcicum();
        this.phaeosphaeriaMaydis = dataAddGermplasmDTO.phaeosphaeriaMaydis();
        this.pucciniaPolysora = dataAddGermplasmDTO.pucciniaPolysora();
        this.physopellaZeae = dataAddGermplasmDTO.physopellaZeae();
        this.cornStunt = dataAddGermplasmDTO.cornStunt();
        this.diplodiaMaydis = dataAddGermplasmDTO.diplodiaMaydis();
        this.fusariumMoniliforme = dataAddGermplasmDTO.fusariumMoniliforme();
        this.gibberellaZeae = dataAddGermplasmDTO.gibberellaZeae();
        this.alturaDePlanta = dataAddGermplasmDTO.alturaDePlanta();
        this.alturaDeEspiga = dataAddGermplasmDTO.alturaDeEspiga();
        this.diametroDaEspiga = dataAddGermplasmDTO.diametroDaEspiga();
        this.numeroDeGraosPorFileira = dataAddGermplasmDTO.numeroDeGraosPorFileira();
        this.numeroDeFileirasDeGraosPorEspiga = dataAddGermplasmDTO.numeroDeFileirasDeGraosPorEspiga();
        this.comprimentoDeEspigas = dataAddGermplasmDTO.comprimentoDeEspigas();
        this.rendimentoDeGraos = dataAddGermplasmDTO.rendimentoDeGraos();
        this.capacidadeDeExpansao = dataAddGermplasmDTO.capacidadeDeExpansao();
        this.massaDeCemGraos = dataAddGermplasmDTO.massaDeCemGraos();
        this.numeroDeEspigas = dataAddGermplasmDTO.numeroDeEspigas();
        this.diametroDoColmo = dataAddGermplasmDTO.diametroDoColmo();
        this.comprimentoDeGrao = dataAddGermplasmDTO.comprimentoDeGrao();
        this.larguraDeGrao = dataAddGermplasmDTO.larguraDeGrao();
        this.espessuraDeGrao = dataAddGermplasmDTO.espessuraDeGrao();
        this.espessuraDoPericarpo = dataAddGermplasmDTO.espessuraDoPericarpo();
        this.difusividadeTermicaDoPericarpo = dataAddGermplasmDTO.difusividadeTermicaDoPericarpo();
        this.teorDeProteina = dataAddGermplasmDTO.teorDeProteina();
        this.teorDeOleo = dataAddGermplasmDTO.teorDeOleo();
        this.amidoTotal = dataAddGermplasmDTO.amidoTotal();
        this.primeiraFolhaPigmentacaoAntocianinicaDaBainha = dataAddGermplasmDTO.primeiraFolhaPigmentacaoAntocianinicaDaBainha();
        this.primeiraFolhaFormaDoApice = dataAddGermplasmDTO.primeiraFolhaFormaDoApice();
        this.folhagemIntensidadeDaCorVerde = dataAddGermplasmDTO.folhagemIntensidadeDaCorVerde();
        this.folhaOndulacaoDaMargemDaLamina = dataAddGermplasmDTO.folhaOndulacaoDaMargemDaLamina();
        this.folhaAnguloEntreALaminaEOColmo = dataAddGermplasmDTO.folhaAnguloEntreALaminaEOColmo();
        this.folhaCurvaturaDaLamina = dataAddGermplasmDTO.folhaCurvaturaDaLamina();
        this.colmoGrauDoZigZag = dataAddGermplasmDTO.colmoGrauDoZigZag();
        this.pendaoCicloAteAAntese = dataAddGermplasmDTO.pendaoCicloAteAAntese();
        this.pendaoPigmentacaoAntocianinicaNaBaseDaGluma = dataAddGermplasmDTO.pendaoPigmentacaoAntocianinicaNaBaseDaGluma();
        this.pendaoPigmentacaoAntocianinicaDaGlumaExcluidaABase = dataAddGermplasmDTO.pendaoPigmentacaoAntocianinicaDaGlumaExcluidaABase();
        this.pendaoPigmentacaoAntocianinicaDasAnteras = dataAddGermplasmDTO.pendaoPigmentacaoAntocianinicaDasAnteras();
        this.pendaoAnguloEntreOEixoPrincipalEOsRamosLaterais = dataAddGermplasmDTO.pendaoAnguloEntreOEixoPrincipalEOsRamosLaterais();
        this.pendaoCurvaturaDosRamosLaterais = dataAddGermplasmDTO.pendaoCurvaturaDosRamosLaterais();
        this.pendaoNumeroDeRamificacoesPrimarias = dataAddGermplasmDTO.pendaoNumeroDeRamificacoesPrimarias();
        this.espigaCicloAteOAparecimentoDosEstigmas = dataAddGermplasmDTO.espigaCicloAteOAparecimentoDosEstigmas();
        this.espigaPigmentacaoAntocianinicaDosEstigmas = dataAddGermplasmDTO.espigaPigmentacaoAntocianinicaDosEstigmas();
        this.colmoPigmentacaoAntocianinicaDasRaizesAereas = dataAddGermplasmDTO.colmoPigmentacaoAntocianinicaDasRaizesAereas();
        this.pendaoDensidadeDasEspiguetas = dataAddGermplasmDTO.pendaoDensidadeDasEspiguetas();
        this.folhaPigmentacaoAntocianinicaDaBainha = dataAddGermplasmDTO.folhaPigmentacaoAntocianinicaDaBainha();
        this.colmoPigmentacaoAntocianinicaDosEntrenos = dataAddGermplasmDTO.colmoPigmentacaoAntocianinicaDosEntrenos();
        this.pendaoCompDoEixoPrincipalAcimaDoRamoLateralMaisBaixo = dataAddGermplasmDTO.pendaoCompDoEixoPrincipalAcimaDoRamoLateralMaisBaixo();
        this.pendaoCompDoEixoPrincipalAcimaDoRamoLateralMaisAlto = dataAddGermplasmDTO.pendaoCompDoEixoPrincipalAcimaDoRamoLateralMaisAlto();
        this.pendaoCompDoRamoLateral = dataAddGermplasmDTO.pendaoCompDoRamoLateral();
        this.plantaComp = dataAddGermplasmDTO.plantaComp();
        this.plantaRelacaoAltInsPedunculoEspigaMaisAltaECompPlanta = dataAddGermplasmDTO.plantaRelacaoAltInsPedunculoEspigaMaisAltaECompPlanta();
        this.folhaLarguraDaLamina = dataAddGermplasmDTO.folhaLarguraDaLamina();
        this.pedunculoComp = dataAddGermplasmDTO.pedunculoComp();
        this.espigaComp = dataAddGermplasmDTO.espigaComp();
        this.espigaDiametroNoMeioDaEspiga = dataAddGermplasmDTO.espigaDiametroNoMeioDaEspiga();
        this.espigaForma = dataAddGermplasmDTO.espigaForma();
        this.espigaNumeroDeFileirasDeGraos = dataAddGermplasmDTO.espigaNumeroDeFileirasDeGraos();
        this.espigaNumeroDeCoresDosGraos = dataAddGermplasmDTO.espigaNumeroDeCoresDosGraos();
        this.graoIntensidadeDaCorAmarela = dataAddGermplasmDTO.graoIntensidadeDaCorAmarela();
        this.graoComp = dataAddGermplasmDTO.graoComp();
        this.graoLargura = dataAddGermplasmDTO.graoLargura();
        this.espigaTipoDeGrao = dataAddGermplasmDTO.espigaTipoDeGrao();
        this.espigaEnrugamentoDoExtremoSuperiorDoGrao = dataAddGermplasmDTO.espigaEnrugamentoDoExtremoSuperiorDoGrao();
        this.espigaCorDoExtremoSuperiorDoGrao = dataAddGermplasmDTO.espigaCorDoExtremoSuperiorDoGrao();
        this.espigaCorDoLadoDorsalDoGrao = dataAddGermplasmDTO.espigaCorDoLadoDorsalDoGrao();
        this.tipoDeGraoEstourado = dataAddGermplasmDTO.tipoDeGraoEstourado();
        this.espigaPigmentacaoAntocianinicaDasGlumasDoSabugo = dataAddGermplasmDTO.espigaPigmentacaoAntocianinicaDasGlumasDoSabugo();
        this.informacoesAdicionais = dataAddGermplasmDTO.informacoesAdicionais();
    }
}

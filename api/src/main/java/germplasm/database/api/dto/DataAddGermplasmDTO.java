package germplasm.database.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataAddGermplasmDTO(

        @NotBlank(message = "O campo nome é obrigatório")
         String nome,

        @NotBlank(message = "O campo tipoDeMaterialGenetico é obrigatório")
         String tipoDeMaterialGenetico,

        @NotBlank(message = "O campo texturaDoGrao é obrigatório")
         String texturaDoGrao,

        @NotBlank(message = "O campo origem é obrigatório")
         String origem,

        @NotNull(message = "O campo transgenico é obrigatório")
         Boolean transgenico,


         String eventosTransgenicos,

        @NotBlank(message = "O campo localNaCamaraFria é obrigatório")
         String localNaCamaraFria,

        @NotBlank(message = "O campo dataDeEntrada é obrigatório")
         String dataDeEntrada,

        @NotBlank(message = "O campo dataDaUltimaColheita é obrigatório")
         String dataDaUltimaColheita,

         Float colletotrichumGraminicola,

         Float pucciniaSorghi,

         Float exserohilumTurcicum,

         Float phaeosphaeriaMaydis,

         Float pucciniaPolysora,

         Float physopellaZeae,

         Float cornStunt,

         Float diplodiaMaydis,

         Float fusariumMoniliforme,

         Float gibberellaZeae,

         Float alturaDePlanta,

         Float alturaDeEspiga,

         Float diametroDaEspiga,

         Float numeroDeGraosPorFileira,

         Float numeroDeFileirasDeGraosPorEspiga,

         Float comprimentoDeEspigas,

         Float rendimentoDeGraos,

         Float capacidadeDeExpansao,

         Float massaDeCemGraos,

         Float numeroDeEspigas,

         Float diametroDoColmo,

         Float comprimentoDeGrao,

         Float larguraDeGrao,

         Float espessuraDeGrao,

         Float espessuraDoPericarpo,

         Float difusividadeTermicaDoPericarpo,

         Float teorDeProteina,

         Float teorDeOleo,

         Float amidoTotal,

         Integer primeiraFolhaPigmentacaoAntocianinicaDaBainha,

         Integer primeiraFolhaFormaDoApice,

         Integer folhagemIntensidadeDaCorVerde,

         Integer folhaOndulacaoDaMargemDaLamina,

         Integer folhaAnguloEntreALaminaEOColmo,

         Integer folhaCurvaturaDaLamina,

         Integer colmoGrauDoZigZag,

         Integer pendaoCicloAteAAntese,

         Integer pendaoPigmentacaoAntocianinicaNaBaseDaGluma,

         Integer pendaoPigmentacaoAntocianinicaDaGlumaExcluidaABase,

         Integer pendaoPigmentacaoAntocianinicaDasAnteras,

         Integer pendaoAnguloEntreOEixoPrincipalEOsRamosLaterais,

         Integer pendaoCurvaturaDosRamosLaterais,

         Integer pendaoNumeroDeRamificacoesPrimarias,

         Integer espigaCicloAteOAparecimentoDosEstigmas,

         Integer espigaPigmentacaoAntocianinicaDosEstigmas,

         Integer colmoPigmentacaoAntocianinicaDasRaizesAereas,

         Integer pendaoDensidadeDasEspiguetas,

         Integer folhaPigmentacaoAntocianinicaDaBainha,

         Integer colmoPigmentacaoAntocianinicaDosEntrenos,

         Integer pendaoCompDoEixoPrincipalAcimaDoRamoLateralMaisBaixo,

         Integer pendaoCompDoEixoPrincipalAcimaDoRamoLateralMaisAlto,

         Integer pendaoCompDoRamoLateral,

         Integer plantaComp,

         Integer plantaRelacaoAltInsPedunculoEspigaMaisAltaECompPlanta,

         Integer folhaLarguraDaLamina,

         Integer pedunculoComp,

         Integer espigaComp,

         Integer espigaDiametroNoMeioDaEspiga,

         Integer espigaForma,

         Integer espigaNumeroDeFileirasDeGraos,

         Integer espigaNumeroDeCoresDosGraos,

         Integer graoIntensidadeDaCorAmarela,

         Integer graoComp,

         Integer graoLargura,

         Integer espigaTipoDeGrao,

         Integer espigaEnrugamentoDoExtremoSuperiorDoGrao,

         Integer espigaCorDoExtremoSuperiorDoGrao,

         Integer espigaCorDoLadoDorsalDoGrao,

         Integer tipoDeGraoEstourado,

         Integer espigaPigmentacaoAntocianinicaDasGlumasDoSabugo,

         String informacoesAdicionais)
         {
}

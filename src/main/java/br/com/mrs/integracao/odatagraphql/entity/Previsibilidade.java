package br.com.mrs.integracao.odatagraphql.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="previsibilidade")
public class Previsibilidade {

    @Id
    private String id;

    private String PID_DOCM_TRPT;

    private int ID_VEIC;

    private String SG_PATIO_ATUAL;

    private String CD_PRFX_INTN_TREM;

    private String SG_PATIO_DEST;

    private String DT_PREV_CHEG_DEST;

    private String DT_PREV_CHEG_DEST_GRADE;

}

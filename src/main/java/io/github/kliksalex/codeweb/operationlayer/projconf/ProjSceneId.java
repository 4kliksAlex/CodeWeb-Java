package io.github.kliksalex.codeweb.operationlayer.projconf;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProjSceneId implements Serializable {
    private String pno;
    private String uno;

    public ProjSceneId(String pno, String uno) {
        this.pno = pno;
        this.uno = uno;
    }
}
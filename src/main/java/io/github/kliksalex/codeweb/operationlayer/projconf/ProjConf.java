package io.github.kliksalex.codeweb.operationlayer.projconf;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "proj_conf")
public class ProjConf {

  @Id
  @Column(name = "pno", nullable = false, length = 255)
  private String pno;

  @Column(name = "cpath", length = 255)
  private String cpath;
}
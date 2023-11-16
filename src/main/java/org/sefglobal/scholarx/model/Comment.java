package org.sefglobal.scholarx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

@Entity
@Data
@Table(name = "comment")
public class Comment extends BaseScholarxModel {
    @ManyToOne
    private Mentee mentee;

    @Column
    private String comment;

    @ManyToOne
    private Profile commented_by;
}

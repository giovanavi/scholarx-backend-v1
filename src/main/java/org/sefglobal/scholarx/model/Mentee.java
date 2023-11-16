package org.sefglobal.scholarx.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import org.sefglobal.scholarx.util.Views;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mentee")
@Data
@NoArgsConstructor
@JsonView(Views.Public.class)
@JsonIgnoreProperties({"createdAt", "updatedAt"})
public class Mentee extends EnrolledUser {

    @Column
    private String university;

    @Column
    private String course;

    @Column
    private String year;

    @Column(columnDefinition = "TEXT")
    private String intent;

    @Column(columnDefinition = "TEXT")
    private String reasonForChoice;

    @Column(columnDefinition = "TEXT")
    private String resumeUrl;

    @Column(columnDefinition = "TEXT")
    private String achievements;

    @ManyToOne(optional = false)
    private Mentor appliedMentor;

    @ManyToOne
    private Mentor assignedMentor;

    @ManyToOne
    private Mentor rejectedBy;

}

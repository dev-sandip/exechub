package com.dev_sandip.ExecHub.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "test_cases")
@Setter
@Getter
public class TestCase extends BaseEntity {


    @Lob
    @Column(nullable = false)
    private String inputData;

    @Lob
    @Column(nullable = false)
    private String expectedOutput;

    @Column(nullable = false)
    private Boolean sample = false;

    @Column(nullable = false)
    private Integer orderIndex;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "problem_id", nullable = false)
    private Problem problem;
}

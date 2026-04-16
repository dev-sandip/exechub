package com.dev_sandip.ExecHub.entity;

import com.dev_sandip.ExecHub.entity.enums.ProblemStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "problems")
public class Problem extends BaseEntity {
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, unique = true)
    private String slug;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String difficulty;
    @Column(nullable = false)
    private Integer timeLimitMs;
    @Column(nullable = false)
    private Integer memoryLimitMb;
    @Enumerated(EnumType.STRING)
    private ProblemStatus problemStatus;
    @ManyToOne(fetch = FetchType.LAZY)
    private User createBy;
    @OneToMany(mappedBy = "problem", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TestCase> testCases = new ArrayList<>();
}
package com.dev_sandip.ExecHub.entity;

import com.dev_sandip.ExecHub.entity.enums.ProgrammingLanguage;
import com.dev_sandip.ExecHub.entity.enums.SubmissionStatus;
import com.dev_sandip.ExecHub.entity.enums.Verdict;
import jakarta.persistence.*;

@Entity
@Table(name = "submissions")
public class Submission extends BaseEntity {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "problem_id", nullable = false)
    private Problem problem;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProgrammingLanguage language;

    @Lob
    @Column(nullable = false)
    private String sourceCode;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SubmissionStatus status;
    @Enumerated(EnumType.STRING)
    private Verdict verdict;
    private Long executionTimeMs;
    private Long memoryUsedKb;
}

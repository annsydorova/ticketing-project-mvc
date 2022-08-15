package com.cydeo.entity;

import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Project extends BaseEntity{
    private String projectName;
    private String projectCode;
    private UserDTO assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private Status status;
    private String details;

    //lombok doesn't create a constructor from parent class,
    // so we need to create all arg constructor manually

    public Project(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime insertUpdateDateTime, Long insertUpdateUserId, String projectName, String projectCode, UserDTO assignedManager, LocalDate startDate, LocalDate endDate,Status status, String details) {
        super(id, insertDateTime, insertUserId, insertUpdateDateTime, insertUpdateUserId);
        this.projectName = projectName;
        this.projectCode = projectCode;
        this.assignedManager = assignedManager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status=status;
        this.details = details;
    }
}

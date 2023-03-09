package com.App1.App1.model.dto.mapper;

import com.App1.App1.model.dto.SubjectDTO;
import com.App1.App1.model.entity.Subject;

public class SubjectMapper {
    public Subject toSubject(SubjectDTO subjectDTO){
        Subject subject = new Subject();
        subject.setSubjectId(subjectDTO.getSubjectId());
        subject.setLp(subjectDTO.getLp());
        return subject;
    }
}

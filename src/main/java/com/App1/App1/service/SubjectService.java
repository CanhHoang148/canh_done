package com.App1.App1.service;

import com.App1.App1.model.entity.Subject;

import java.util.List;

public interface SubjectService {
    Subject addSubject(Subject subject);

    List<Subject> getAllSubject();

    void deleteSubject(String id);

    Subject editSubject(Subject subject);
}

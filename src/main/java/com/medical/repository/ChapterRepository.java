package com.medical.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.entity.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {

	Chapter findByChapterNumber(long chapterNumber);
}

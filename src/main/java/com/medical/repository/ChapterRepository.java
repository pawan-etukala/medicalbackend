package com.medical.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.entity.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
<<<<<<< HEAD
	Optional<Chapter> findByid(Long chapterNumber);
=======

	Optional<Chapter> findByChapterNumber(Long chapterNumber);
//	findByChapterNumber(long chapterNumber);
>>>>>>> b28335fff69b297a6ac91ca4205f735299863f2e
}

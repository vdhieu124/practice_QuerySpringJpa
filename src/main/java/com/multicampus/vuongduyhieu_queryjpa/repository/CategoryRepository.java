package com.multicampus.vuongduyhieu_queryjpa.repository;

import com.multicampus.vuongduyhieu_queryjpa.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("select c from Category c where c.cate_id not in (select p.category.cate_id from Post p)")
    List<Category> findAllByNoPost();

    @Query("select c from Category c where c.cate_id = (select tb.cid from (select p.category.cate_id as cid, count(p) from Post p group by (p.category.cate_id) order by count(p) desc limit 1) as tb)")
    Category findByMaxPost();

}

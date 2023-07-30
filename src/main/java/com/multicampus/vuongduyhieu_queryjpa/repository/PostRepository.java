package com.multicampus.vuongduyhieu_queryjpa.repository;

import com.multicampus.vuongduyhieu_queryjpa.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
//    @Query(value = "SELECT * FROM post p join category c on p.category.cate_id = c.cate_id where c.cate_name = :name",nativeQuery = true)
    @Query("SELECT p FROM Post p WHERE p.category.cate_id = (SELECT c.cate_id FROM Category c WHERE c.cate_name = :name)")
    List<Post> findAllByCateName(@Param("name") String name);

    @Query("select p from Post p where p.author.aut_id = (select a.aut_id from Author a where a.aut_name=:name)")
    List<Post> findAllByAutName(@Param("name") String name);

    @Query("select p.post_id, p.title, p.song_name, a.aut_name, c.cate_name, p.createAt from Post p join p.author a join p.category c")
    List<Post> findAllCustom();
}

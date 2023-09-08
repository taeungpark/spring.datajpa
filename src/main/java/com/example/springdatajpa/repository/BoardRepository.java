package com.example.springdatajpa.repository;

import com.example.springdatajpa.domain.Board;
import com.example.springdatajpa.dto.BoardInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {

    // jpql
    // behind the "from" is the name of Entity
    @Query(value = "select b from Board b join fetch b.user")
//    @Query(value = "select b from Board b join User u on b.user.userId = u.userId") // general query (Worse than using fetch)
    List<Board> getBoards();

    @Query(value = "select count(b) from Board b")
    Long getBoardCount();

    // SQL : select * from board b, user u, user_role ur, role r where b.user_id = u.user_id
    // and u.user_id = ur.user_id and ur.role_id = r.role_id and r.name = ?;
//    @Query(value = "select b from Board b inner join b.user u inner join u.roles r where r.name = :roleName")
//    @Query(value = "select b from Board b inner join fetch b.user u inner join u.roles r where r.name = :roleName")
    @Query(value = "select b, u from Board b inner join b.user u inner join u.roles r where r.name = :roleName")
    List<Board> getBoards(@Param("roleName") String roleName);

    @Query(value = "select b.board_id, b.title, b.content, b.user_id, u.name, b.regdate, b.view_cnt from board b, user u where b.user_id = u.user_id", nativeQuery = true)
    List<BoardInterface> getBoardsWithNativeQuery();
}
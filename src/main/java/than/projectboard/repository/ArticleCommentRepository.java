package than.projectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import than.projectboard.domain.ArticleComment;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}

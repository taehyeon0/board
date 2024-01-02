package than.projectboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import than.projectboard.domain.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}

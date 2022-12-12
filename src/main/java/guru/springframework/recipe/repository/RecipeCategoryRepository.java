package guru.springframework.recipe.repository;

import guru.springframework.recipe.domain.RecipeCategory;
import org.springframework.data.repository.CrudRepository;

public interface RecipeCategoryRepository extends CrudRepository<RecipeCategory, Long> {
}

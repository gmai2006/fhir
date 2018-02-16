

import static java.util.Objects.requireNonNull;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.google.inject.Provider;

public class AbstractDao {
	private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AbstractDao (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }
}

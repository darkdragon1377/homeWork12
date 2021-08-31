package ir.maktab56.base.repository.impl;

import ir.maktab56.base.domain.BaseEntity;
import ir.maktab56.base.repository.BaseRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public abstract class BaseRepositoryImpl <Entity extends BaseEntity<ID>, ID extends Serializable>
        implements BaseRepository<Entity, ID> {

    protected final EntityManager entityManager;

    public BaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public abstract Class<Entity> getEntityClass();

    @Override
    public Entity insert(Entity entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public Entity findById(ID id) {
        return entityManager.find(getEntityClass(), id);
    }

    @Override
    public List<Entity> findAll() {
        return entityManager.createQuery(
                "from" + getEntityClass().getSimpleName(),
                getEntityClass()
        ).getResultList();
    }

    @Override
    public Entity update(Entity entity) {
        return entityManager.merge(entity);
    }

    @Override
    public void delete(Entity entity) {
        entityManager.remove(entity);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}

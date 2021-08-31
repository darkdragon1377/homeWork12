package ir.maktab56.base.service.impl;

import ir.maktab56.base.domain.BaseEntity;
import ir.maktab56.base.repository.BaseRepository;
import ir.maktab56.base.service.BaseService;

import java.io.Serializable;
import java.util.List;

public class BaseServiceImpl <Entity extends BaseEntity<ID>, ID extends Serializable,
        Repository extends BaseRepository<Entity, ID>> implements BaseService<Entity, ID> {
    protected final Repository repository;

    public BaseServiceImpl(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Entity insert(Entity entity) {
        repository.getEntityManager().getTransaction().begin();
        entity = repository.insert(entity);
        repository.getEntityManager().getTransaction().commit();
        return entity;
    }

    @Override
    public Entity findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public List<Entity> findAll() {
        return repository.findAll();
    }

    @Override
    public Entity update(Entity entity) {
        repository.getEntityManager().getTransaction().begin();
        repository.update(entity);
        repository.getEntityManager().getTransaction().commit();
        return entity;
    }

    @Override
    public void delete(Entity entity) {
        repository.getEntityManager().getTransaction().begin();
        repository.delete(entity);
        repository.getEntityManager().getTransaction().commit();
    }
}
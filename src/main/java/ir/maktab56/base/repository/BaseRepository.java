package ir.maktab56.base.repository;

import com.sun.xml.bind.v2.model.core.ID;
import ir.maktab56.base.domain.BaseEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface BaseRepository <Entity extends BaseEntity<ID>, ID extends Serializable>{
    Entity insert (Entity entity);

    Entity findById (ID id);

    List<Entity> findAll();

    Entity update(Entity entity);

    void delete (Entity entity);

    EntityManager getEntityManager();
}

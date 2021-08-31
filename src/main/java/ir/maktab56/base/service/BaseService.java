package ir.maktab56.base.service;
import com.sun.xml.bind.v2.model.core.ID;
import ir.maktab56.base.domain.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseService <Entity extends BaseEntity<ID>, ID extends Serializable>{
    Entity insert (Entity entity);

    Entity findById (ID id);

    List<Entity> findAll();

    Entity update(Entity entity);

    void delete (Entity entity);
}

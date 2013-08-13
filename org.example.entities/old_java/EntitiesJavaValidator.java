package org.example.entities.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.validation.Check;
import org.example.entities.entities.EntitiesPackage;
import org.example.entities.entities.Entity;

public class EntitiesJavaValidator extends AbstractEntitiesJavaValidator {

	public static final String HIERARCHY_CICLE = "org.example.entities.HierarchyCycle";

	@Check
	public void checkNoCycleInEntityHierarchy(Entity entity) {
		if (entity.getSuperType() == null)
			return; // nothing to check

		Set<Entity> visitedEntities = new HashSet<Entity>();
		visitedEntities.add(entity);
		Entity current = entity.getSuperType();
		while (current != null) {
			if (visitedEntities.contains(current)) {
				error("cycle in hierarchy of entity '" + current.getName() + "'",
						EntitiesPackage.Literals.ENTITY__SUPER_TYPE,
						HIERARCHY_CICLE,
						current.getSuperType().getName());
				return;
			}
			visitedEntities.add(current);
			current = current.getSuperType();
		}
	}
}

package net.techcable.sonarpet.nms.entity;

import com.dsh105.echopet.compat.api.entity.IEntityNoClipPet;
import com.dsh105.echopet.compat.api.entity.IPet;

import net.techcable.sonarpet.EntityHookType;
import net.techcable.sonarpet.nms.NMSInsentientEntity;

public abstract class EntityNoClipPet extends EntityInsentientPet implements IEntityNoClipPet {
    protected EntityNoClipPet(IPet pet, NMSInsentientEntity entity, EntityHookType hookType) {
        super(pet, entity, hookType);
    }

    @Override
    public void noClip(boolean b) {
        getEntity().setNoClip(b);
    }
}

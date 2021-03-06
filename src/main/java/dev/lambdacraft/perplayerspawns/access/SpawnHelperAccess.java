package dev.lambdacraft.perplayerspawns.access;

import net.minecraft.entity.mob.MobEntity;

import java.util.function.Consumer;

public interface SpawnHelperAccess {
  ThreadLocal<Integer> maxSpawns = new ThreadLocal<>();
  ThreadLocal<Consumer<MobEntity>> trackEntity = new ThreadLocal<>();
}

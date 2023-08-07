package com.example.mixin

import net.minecraft.server.MinecraftServer
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(Array(classOf[MinecraftServer]))
class ExampleMixin {
	@Inject(at = new At("HEAD"), method = "loadWorld")
	private def init(info: CallbackInfo): Unit = {
		// This code is injected into the start of MinecraftServer.loadWorld()V
	}
}
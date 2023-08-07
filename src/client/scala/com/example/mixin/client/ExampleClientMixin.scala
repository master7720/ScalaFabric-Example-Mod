package com.example.mixin.client

import net.minecraft.client.MinecraftClient
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(Array(classOf[MinecraftClient]))
class ExampleClientMixin {
	@Inject(at = new At("HEAD"), method = "run")
	private def run(info: CallbackInfo): Unit = {
		// This code is injected into the start of MinecraftClient.run()V
	}
}
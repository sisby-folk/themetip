package gay.marie_the.themetip.mixin;

import gay.marie_the.themetip.Themetip;
import net.minecraft.client.gui.tooltip.TooltipBackgroundRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import static gay.marie_the.themetip.ThemetipConfig.asColor;

@Mixin(TooltipBackgroundRenderer.class)
public class TooltipBackgroundMixin {
	@ModifyArg(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/tooltip/TooltipBackgroundRenderer;renderBorder(Lnet/minecraft/client/gui/DrawContext;IIIIIII)V"), index = 6)
	private static int primary(int x){
		return asColor(Themetip.CONFIG.primaryColor);
	}

	@ModifyArg(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/tooltip/TooltipBackgroundRenderer;renderBorder(Lnet/minecraft/client/gui/DrawContext;IIIIIII)V"), index = 7)
	private static int secondary(int x){
		return Themetip.CONFIG.gradient ? asColor(Themetip.CONFIG.secondaryColor) : asColor(Themetip.CONFIG.primaryColor);
	}

	@ModifyArg(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/tooltip/TooltipBackgroundRenderer;renderHorizontalLine(Lnet/minecraft/client/gui/DrawContext;IIIII)V"), index = 5)
	private static int background1(int x){
		return Themetip.CONFIG.thickEdges ? asColor(Themetip.CONFIG.backgroundColor) : 0;
	}

	@ModifyArg(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/tooltip/TooltipBackgroundRenderer;renderHorizontalLine(Lnet/minecraft/client/gui/DrawContext;IIIII)V", ordinal = 1), index = 5)
	private static int background2(int x){
		return Themetip.CONFIG.thickEdges ? asColor(Themetip.CONFIG.backgroundColor) : 0;
	}

	@ModifyArg(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/tooltip/TooltipBackgroundRenderer;renderVerticalLine(Lnet/minecraft/client/gui/DrawContext;IIIII)V"), index = 5)
	private static int background3(int x){
		return Themetip.CONFIG.thickEdges ? asColor(Themetip.CONFIG.backgroundColor) : 0;
	}
	@ModifyArg(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/tooltip/TooltipBackgroundRenderer;renderVerticalLine(Lnet/minecraft/client/gui/DrawContext;IIIII)V", ordinal = 1), index = 5)
	private static int background4(int x){
		return Themetip.CONFIG.thickEdges ? asColor(Themetip.CONFIG.backgroundColor) : 0;
	}

	@ModifyArg(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/tooltip/TooltipBackgroundRenderer;renderRectangle(Lnet/minecraft/client/gui/DrawContext;IIIIII)V"), index = 6)
	private static int background5(int x){
		return asColor(Themetip.CONFIG.backgroundColor);
	}




}
package titanium_awa.test0.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent TEST_APPLE = new FoodComponent.Builder().nutrition(10).saturationModifier(1.0f).build();
    public static final FoodComponent ULTIMATE_APPLE = new FoodComponent.Builder().nutrition(2147483647).saturationModifier(0.5f)//这是一个乘积，计算方法为饱和度=.nutrition*.saturationModifier*2.0f。为了使其不溢出，就改成0.5f了
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2147483647, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2147483647, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2147483647, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2147483647, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2147483647, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 2147483647, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 2147483647, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 2147483647, 255), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 2147483647, 255), 1.0F)
            .alwaysEdible()
            .snack()
            .build();
}
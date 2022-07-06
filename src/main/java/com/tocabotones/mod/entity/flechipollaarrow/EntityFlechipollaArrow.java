package com.tocabotones.mod.entity.flechipollaarrow;

import com.tocabotones.mod.init.ItemInit;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

import java.util.Random;

public class EntityFlechipollaArrow extends EntityArrow {
    public EntityFlechipollaArrow(World worldIn) {
        super(worldIn);
    }

    public EntityFlechipollaArrow(World worldIn, double x, double y, double z) {
        super(worldIn, x,y,z);
    }

    public EntityFlechipollaArrow(World worldIn, EntityLivingBase shooter) {
        super(worldIn, shooter);
    }


    @Override
    protected ItemStack getArrowStack() {
        return new ItemStack(ItemInit.FLECHIPOLLA);
    }

    @Override
    protected void arrowHit(EntityLivingBase living) {
        super.arrowHit(living);
        living.setInWeb();
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (this.world.isRemote){
            if(this.inGround){
                if(this.timeInGround % 5 == 0){
                    this.spawnParticles(1);
                }
            } else{
                this.spawnParticles(2);
            }
        }
    }

    // Hace aparecer particulas en el recorrido de la flecha
    private void spawnParticles(int particleCount){
        Random rand = new Random();
        int i = rand.nextInt(15);

        double d0 = (double) (i >> 16 & 255) / 255.0d;
        double d1 = (double) (i >> 8 & 255) / 255.0d;
        double d2 = (double) (i >> 0 & 255) / 255.0d;

        for (int j = 0; j < particleCount; j++){
            this.world.spawnParticle(EnumParticleTypes.SNOWBALL,
                    this.posX + (this.rand.nextDouble() - 0.5d) * (double)this.width,
                    this.posY + this.rand.nextDouble() * (double) this.height,
                    this.posZ + (this.rand.nextDouble() - 0.5d) * (double) this.width,
                    d0,d1,d2);
        }
    }
}

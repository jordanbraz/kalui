package com.sirlenark.kaluimod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSpider - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelScorpion extends ModelBase {
    public ModelRenderer neck;
    public ModelRenderer direita3;
    public ModelRenderer head;
    public ModelRenderer ass;
    public ModelRenderer direita1;
    public ModelRenderer direita1_1;
    public ModelRenderer direita4;
    public ModelRenderer esquerda2;
    public ModelRenderer esquerda1;
    public ModelRenderer esquerda3;
    public ModelRenderer esquerda4;
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer tail4;
    public ModelRenderer tail5;
    public ModelRenderer tail5_1;
    public ModelRenderer esquerdaarm;
    public ModelRenderer direitaarm;

    public ModelScorpion() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.direita1 = new ModelRenderer(this, 18, 0);
        this.direita1.setRotationPoint(0.0F, 15.2F, 1.3F);
        this.direita1.addBox(-15.2F, -1.0F, -1.0F, 12, 2, 2, 0.0F);
        this.setRotateAngle(direita1, 0.016406094968746697F, -0.022165681500327983F, -0.18029251173101424F);
        this.tail3 = new ModelRenderer(this, 0, 0);
        this.tail3.setRotationPoint(-1.9F, 7.2F, 12.8F);
        this.tail3.addBox(0.0F, 0.0F, 0.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(tail3, 1.7744762505026348F, 0.0F, 0.0F);
        this.direita1_1 = new ModelRenderer(this, 18, 0);
        this.direita1_1.setRotationPoint(0.0F, 15.2F, -2.1F);
        this.direita1_1.addBox(-15.2F, -1.0F, -1.0F, 12, 2, 2, 0.0F);
        this.setRotateAngle(direita1_1, 0.016406094968746697F, -0.022165681500327983F, -0.18029251173101424F);
        this.direita3 = new ModelRenderer(this, 18, 0);
        this.direita3.setRotationPoint(-0.6F, 14.1F, 5.4F);
        this.direita3.addBox(-15.2F, -1.0F, -1.0F, 12, 2, 2, 0.0F);
        this.setRotateAngle(direita3, 0.016406094968746697F, -0.022165681500327983F, -0.18029251173101424F);
        this.tail2 = new ModelRenderer(this, 0, 0);
        this.tail2.setRotationPoint(-2.5F, 9.3F, 11.2F);
        this.tail2.addBox(0.0F, 0.0F, 0.0F, 6, 3, 4, 0.0F);
        this.setRotateAngle(tail2, 1.0761700167797035F, 0.0F, -0.0F);
        this.esquerda2 = new ModelRenderer(this, 18, 0);
        this.esquerda2.setRotationPoint(3.1F, 13.3F, 0.0F);
        this.esquerda2.addBox(0.0F, 0.0F, 0.0F, 12, 2, 2, 0.0F);
        this.setRotateAngle(esquerda2, 0.0F, 0.0F, 0.18029251173101424F);
        this.neck = new ModelRenderer(this, 0, 0);
        this.neck.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.neck.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
        this.ass = new ModelRenderer(this, 0, 12);
        this.ass.setRotationPoint(0.8F, 14.9F, 9.0F);
        this.ass.addBox(-5.0F, -4.0F, -6.0F, 9, 7, 9, 0.0F);
        this.esquerda1 = new ModelRenderer(this, 18, 0);
        this.esquerda1.setRotationPoint(3.1F, 13.3F, -3.2F);
        this.esquerda1.addBox(0.0F, 0.0F, 0.0F, 12, 2, 2, 0.0F);
        this.setRotateAngle(esquerda1, 0.0F, 0.0F, 0.18029251173101424F);
        this.direita4 = new ModelRenderer(this, 18, 0);
        this.direita4.setRotationPoint(0.0F, 13.2F, 8.0F);
        this.direita4.addBox(-15.2F, 0.0F, 0.0F, 12, 2, 2, 0.0F);
        this.setRotateAngle(direita4, 0.016406094968746697F, -0.022165681500327983F, -0.18029251173101424F);
        this.esquerdaarm = new ModelRenderer(this, 18, 0);
        this.esquerdaarm.setRotationPoint(2.4F, 13.3F, -2.7F);
        this.esquerdaarm.addBox(0.0F, 0.0F, 0.0F, 12, 3, 3, 0.0F);
        this.setRotateAngle(esquerdaarm, 0.0F, 0.5846852994181004F, 0.03686587203155378F);
        this.tail4 = new ModelRenderer(this, 0, 0);
        this.tail4.setRotationPoint(-1.4F, 4.7F, 12.1F);
        this.tail4.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(tail4, 2.3150047198452786F, 0.0F, 0.0F);
        this.tail5 = new ModelRenderer(this, 0, 0);
        this.tail5.setRotationPoint(-1.0F, 0.0F, 5.6F);
        this.tail5.addBox(0.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(tail5, 0.5099852074327431F, 0.0F, 0.0F);
        this.esquerda4 = new ModelRenderer(this, 18, 0);
        this.esquerda4.setRotationPoint(3.1F, 13.5F, 8.1F);
        this.esquerda4.addBox(0.0F, 0.0F, 0.0F, 12, 2, 2, 0.0F);
        this.setRotateAngle(esquerda4, 0.0F, 0.0F, 0.18029251173101424F);
        this.tail1 = new ModelRenderer(this, 0, 0);
        this.tail1.setRotationPoint(-3.1F, 8.7F, 11.7F);
        this.tail1.addBox(0.0F, 0.0F, 0.0F, 7, 4, 4, 0.0F);
        this.setRotateAngle(tail1, -0.8911651160683047F, 0.0F, 0.0F);
        this.esquerda3 = new ModelRenderer(this, 18, 0);
        this.esquerda3.setRotationPoint(3.1F, 13.3F, 4.3F);
        this.esquerda3.addBox(0.0F, 0.0F, 0.0F, 12, 2, 2, 0.0F);
        this.setRotateAngle(esquerda3, 0.0F, 0.0F, 0.18029251173101424F);
        this.direitaarm = new ModelRenderer(this, 18, 0);
        this.direitaarm.setRotationPoint(-11.4F, 13.4F, -9.4F);
        this.direitaarm.addBox(0.0F, 0.0F, 0.0F, 12, 3, 3, 0.0F);
        this.setRotateAngle(direitaarm, 0.0F, -0.5759586531581287F, -0.13517486411569724F);
        this.tail5_1 = new ModelRenderer(this, 0, 0);
        this.tail5_1.setRotationPoint(0.0F, 1.9F, 5.4F);
        this.tail5_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(tail5_1, 0.9145885204780086F, 0.010952390514989132F, 0.0F);
        this.head = new ModelRenderer(this, 32, 4);
        this.head.setRotationPoint(0.0F, 15.0F, -3.0F);
        this.head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.direita1.render(f5);
        this.tail3.render(f5);
        this.direita1_1.render(f5);
        this.direita3.render(f5);
        this.tail2.render(f5);
        this.esquerda2.render(f5);
        this.neck.render(f5);
        this.ass.render(f5);
        this.esquerda1.render(f5);
        this.direita4.render(f5);
        this.esquerdaarm.render(f5);
        this.tail4.render(f5);
        this.tail5.render(f5);
        this.esquerda4.render(f5);
        this.tail1.render(f5);
        this.esquerda3.render(f5);
        this.direitaarm.render(f5);
        this.tail5_1.render(f5);
        this.head.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

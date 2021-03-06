package net.ilexiconn.jurassicraft.client.model.entity;

import net.ilexiconn.jurassicraft.client.model.animation.Animator;
import net.ilexiconn.jurassicraft.client.model.base.MowzieModelBase;
import net.ilexiconn.jurassicraft.client.model.base.MowzieModelRenderer;
import net.ilexiconn.jurassicraft.common.entity.dinosaurs.EntityVelociraptor;
import net.ilexiconn.jurassicraft.common.data.enums.JurassiCraftAnimationIDs;
import net.ilexiconn.jurassicraft.common.api.IAnimatedEntity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVelociraptor extends MowzieModelBase
{
    MowzieModelRenderer Left_Upper_Foot;
    MowzieModelRenderer Right_Upper_Foot;
    MowzieModelRenderer Left_Calf_1;
    MowzieModelRenderer Right_Calf_1;
    MowzieModelRenderer Left_Thigh;
    MowzieModelRenderer Right_Thigh;
    MowzieModelRenderer Body_1;
    MowzieModelRenderer Body_2;
    MowzieModelRenderer Neck;
    MowzieModelRenderer Head;
    MowzieModelRenderer Upper_Jaw;
    MowzieModelRenderer Lower_Jaw;
    MowzieModelRenderer Tail_1;
    MowzieModelRenderer Tail_2;
    MowzieModelRenderer Tail_3;
    MowzieModelRenderer Tail_4;
    MowzieModelRenderer Tail_5;
    MowzieModelRenderer Tail_6;
    MowzieModelRenderer Upper_Arm_Right;
    MowzieModelRenderer Upper_Arm_Left;
    MowzieModelRenderer Lower_Arm_Left;
    MowzieModelRenderer Lower_Arm_Right;
    MowzieModelRenderer Hand_Left;
    MowzieModelRenderer Hand_Right;
    MowzieModelRenderer Hand_Left_Claw_Left;
    MowzieModelRenderer Hand_Left_Claw_Right;
    MowzieModelRenderer Hand_Left_Claw_Middle;
    MowzieModelRenderer Hand_Right_Claw_Right;
    MowzieModelRenderer Hand_Right_Claw_Left;
    MowzieModelRenderer Hand_Right_Claw_Middle;
    MowzieModelRenderer Foot_Left;
    MowzieModelRenderer Foot_Right;
    MowzieModelRenderer Left_Claw_1;
    MowzieModelRenderer Left_Claw_2;
    MowzieModelRenderer Right_Claw_1;
    MowzieModelRenderer Right_Claw_2;
    MowzieModelRenderer Quill_1;
    MowzieModelRenderer Quill_2;
    MowzieModelRenderer Quill_3;
    MowzieModelRenderer Quill_4;
    MowzieModelRenderer Quill_5;
    MowzieModelRenderer Quill_6;
    MowzieModelRenderer Quill_7;
    MowzieModelRenderer HeadJoint;
    MowzieModelRenderer[] rightArmParts;
    MowzieModelRenderer[] leftArmParts;
    MowzieModelRenderer[] tailParts;
    private Animator animator;
    private float TwitchAngle = 0.5F;

    public ModelVelociraptor()
    {
        textureWidth = 256;
        textureHeight = 256;

        animator = new Animator(this);

        Left_Upper_Foot = new MowzieModelRenderer(this, 81, 0);
        Left_Upper_Foot.addBox(-1F, 0F, 0F, 2, 7, 2);
        Left_Upper_Foot.setRotationPoint(6F, 17.2F, 9F);
        Left_Upper_Foot.setTextureSize(256, 256);
        Left_Upper_Foot.mirror = true;
        setRotation(Left_Upper_Foot, -0.6108652F, 0F, 0F);
        Right_Upper_Foot = new MowzieModelRenderer(this, 81, 0);
        Right_Upper_Foot.addBox(-1F, 0F, 0F, 2, 7, 2);
        Right_Upper_Foot.setRotationPoint(-6.1F, 17F, 9.1F);
        Right_Upper_Foot.setTextureSize(256, 256);
        Right_Upper_Foot.mirror = true;
        setRotation(Right_Upper_Foot, -0.6108652F, 0F, 0F);
        Left_Calf_1 = new MowzieModelRenderer(this, 65, 0);
        Left_Calf_1.addBox(-1.5F, 0F, 0F, 3, 10, 3);
        Left_Calf_1.setRotationPoint(6F, 12.5F, 2F);
        Left_Calf_1.setTextureSize(256, 256);
        Left_Calf_1.mirror = true;
        setRotation(Left_Calf_1, 0.7063936F, 0F, 0F);
        Right_Calf_1 = new MowzieModelRenderer(this, 65, 0);
        Right_Calf_1.addBox(-1.5F, 0F, 0F, 3, 10, 3);
        Right_Calf_1.setRotationPoint(-6F, 12.5F, 2F);
        Right_Calf_1.setTextureSize(256, 256);
        Right_Calf_1.mirror = true;
        setRotation(Right_Calf_1, 0.7238469F, 0F, 0F);
        Left_Thigh = new MowzieModelRenderer(this, 27, 57);
        Left_Thigh.addBox(0F, 0F, -12F, 5, 5, 12);
        Left_Thigh.setRotationPoint(3.5F, 3F, 9.9F);
        Left_Thigh.setTextureSize(256, 256);
        Left_Thigh.mirror = true;
        setRotation(Left_Thigh, 0.6252203F, 0F, 0F);
        Right_Thigh = new MowzieModelRenderer(this, 27, 57);
        Right_Thigh.addBox(-5F, 0F, -12F, 5, 5, 12);
        Right_Thigh.setRotationPoint(-3.5F, 3F, 9.9F);
        Right_Thigh.setTextureSize(256, 256);
        Right_Thigh.mirror = true;
        setRotation(Right_Thigh, 0.6252203F, 0F, 0F);
        Body_1 = new MowzieModelRenderer(this, 118, 0);
        Body_1.addBox(-4.5F, 0F, -17F, 9, 9, 21);
        Body_1.setRotationPoint(0F, 0.5F, 10F);
        Body_1.setTextureSize(256, 256);
        Body_1.mirror = true;
        setRotation(Body_1, -0.0743572F, 0F, 0F);
        Body_2 = new MowzieModelRenderer(this, 182, 0);
        Body_2.addBox(-4F, 0F, 0F, 8, 9, 8);
        Body_2.setRotationPoint(0F, -1.2F, -9F);
        Body_2.setTextureSize(256, 256);
        Body_2.mirror = true;
        setRotation(Body_2, -0.1858931F, 0F, 0F);
        Neck = new MowzieModelRenderer(this, 217, 0);
        Neck.addBox(-2.5F, 0F, -13F, 5, 5, 13);
        Neck.setRotationPoint(0F, 3.1F, -5.8F);
        Neck.setTextureSize(256, 256);
        Neck.mirror = true;
        setRotation(Neck, -0.7820786F, 0F, 0F);
        Head = new MowzieModelRenderer(this, 0, 92);
        Head.addBox(-3.5F, 0F, -6F, 7, 7, 6);
        Head.setRotationPoint(0F, -6F, -15F);
        Head.setTextureSize(256, 256);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Upper_Jaw = new MowzieModelRenderer(this, 11, 26);
        Upper_Jaw.addBox(-2.5F, 0F, 0F, 5, 4, 8);
        Upper_Jaw.setRotationPoint(0F, -0.5F, -20F);
        Upper_Jaw.setTextureSize(256, 256);
        Upper_Jaw.mirror = true;
        setRotation(Upper_Jaw, -3.141593F, 0F, 0F);
        Lower_Jaw = new MowzieModelRenderer(this, 71, 27);
        Lower_Jaw.addBox(-1.5F, 0F, 0F, 3, 1, 7);
        Lower_Jaw.setRotationPoint(0F, 0.5F, -20F);
        Lower_Jaw.setTextureSize(256, 256);
        Lower_Jaw.mirror = true;
        setRotation(Lower_Jaw, -3.141593F, 0F, 0F);
        Tail_1 = new MowzieModelRenderer(this, 118, 39);
        Tail_1.addBox(-4F, 0F, 0F, 8, 8, 10);
        Tail_1.setRotationPoint(0F, 1.1F, 11F);
        Tail_1.setTextureSize(256, 256);
        Tail_1.mirror = true;
        setRotation(Tail_1, 0.0181172F, 0F, 0F);
        Tail_2 = new MowzieModelRenderer(this, 118, 61);
        Tail_2.addBox(-3.5F, 0F, 0F, 7, 6, 8);
        Tail_2.setRotationPoint(0F, 1.8F, 19F);
        Tail_2.setTextureSize(256, 256);
        Tail_2.mirror = true;
        setRotation(Tail_2, 0.0351279F, 0F, 0F);
        Tail_3 = new MowzieModelRenderer(this, 118, 119);
        Tail_3.addBox(-3F, 0F, 0F, 6, 5, 8);
        Tail_3.setRotationPoint(0F, 2.1F, 24F);
        Tail_3.setTextureSize(256, 256);
        Tail_3.mirror = true;
        setRotation(Tail_3, 0.0523599F, 0F, 0F);
        Tail_4 = new MowzieModelRenderer(this, 118, 80);
        Tail_4.addBox(-2F, 0F, 0F, 4, 4, 9);
        Tail_4.setRotationPoint(0F, 2.5F, 29F);
        Tail_4.setTextureSize(256, 256);
        Tail_4.mirror = true;
        setRotation(Tail_4, 0.0371786F, 0F, 0F);
        Tail_5 = new MowzieModelRenderer(this, 118, 100);
        Tail_5.addBox(-1.5F, 0F, 0F, 3, 3, 11);
        Tail_5.setRotationPoint(0F, 2.8F, 35F);
        Tail_5.setTextureSize(256, 256);
        Tail_5.mirror = true;
        setRotation(Tail_5, 0.0371786F, 0F, 0F);
        Tail_6 = new MowzieModelRenderer(this, 118, 132);
        Tail_6.addBox(-1F, 0F, 0F, 2, 2, 8);
        Tail_6.setRotationPoint(0F, 2.7F, 44F);
        Tail_6.setTextureSize(256, 256);
        Tail_6.mirror = true;
        setRotation(Tail_6, 0F, 0F, 0F);
        Upper_Arm_Right = new MowzieModelRenderer(this, 0, 56);
        Upper_Arm_Right.addBox(-3F, 0F, 0F, 3, 3, 7);
        Upper_Arm_Right.setRotationPoint(-3.5F, 5F, -5F);
        Upper_Arm_Right.setTextureSize(256, 256);
        Upper_Arm_Right.mirror = true;
        setRotation(Upper_Arm_Right, -1.07818F, 0F, 0F);
        Upper_Arm_Left = new MowzieModelRenderer(this, 0, 56);
        Upper_Arm_Left.addBox(0F, 0F, 0F, 3, 3, 7);
        Upper_Arm_Left.setRotationPoint(3.5F, 5F, -5F);
        Upper_Arm_Left.setTextureSize(256, 256);
        Upper_Arm_Left.mirror = true;
        setRotation(Upper_Arm_Left, -1.07818F, 0F, 0F);
        Lower_Arm_Left = new MowzieModelRenderer(this, 0, 68);
        Lower_Arm_Left.addBox(-1F, 0F, 0F, 2, 5, 2);
        Lower_Arm_Left.setRotationPoint(5F, 10F, -4F);
        Lower_Arm_Left.setTextureSize(256, 256);
        Lower_Arm_Left.mirror = true;
        setRotation(Lower_Arm_Left, -0.6320364F, 0F, 0F);
        Lower_Arm_Right = new MowzieModelRenderer(this, 0, 68);
        Lower_Arm_Right.addBox(-1F, 0F, 0F, 2, 5, 2);
        Lower_Arm_Right.setRotationPoint(-5F, 10F, -4F);
        Lower_Arm_Right.setTextureSize(256, 256);
        Lower_Arm_Right.mirror = true;
        setRotation(Lower_Arm_Right, -0.6320364F, 0F, 0F);
        Hand_Left = new MowzieModelRenderer(this, 81, 54);
        Hand_Left.addBox(-1F, 0F, -1F, 2, 2, 1);
        Hand_Left.setRotationPoint(5F, 14F, -6.8F);
        Hand_Left.setTextureSize(256, 256);
        Hand_Left.mirror = true;
        setRotation(Hand_Left, 0F, -0.4014257F, 0F);
        Hand_Right = new MowzieModelRenderer(this, 81, 54);
        Hand_Right.addBox(-1F, 0F, -1F, 2, 2, 1);
        Hand_Right.setRotationPoint(-5F, 14F, -6.8F);
        Hand_Right.setTextureSize(256, 256);
        Hand_Right.mirror = true;
        setRotation(Hand_Right, 0F, 0.4014257F, 0F);
        Hand_Left_Claw_Left = new MowzieModelRenderer(this, 81, 45);
        Hand_Left_Claw_Left.addBox(-0.8F, 1F, -0.5F, 1, 2, 1);
        Hand_Left_Claw_Left.setRotationPoint(5F, 14F, -6.8F);
        Hand_Left_Claw_Left.setTextureSize(256, 256);
        Hand_Left_Claw_Left.mirror = true;
        setRotation(Hand_Left_Claw_Left, -0.4712389F, -1.972222F, 0F);
        Hand_Left_Claw_Right = new MowzieModelRenderer(this, 81, 45);
        Hand_Left_Claw_Right.addBox(-0.8F, 1F, -0.5F, 1, 2, 1);
        Hand_Left_Claw_Right.setRotationPoint(5F, 14F, -6.8F);
        Hand_Left_Claw_Right.setTextureSize(256, 256);
        Hand_Left_Claw_Right.mirror = true;
        setRotation(Hand_Left_Claw_Right, 0.4712389F, -1.972222F, 0F);
        Hand_Left_Claw_Middle = new MowzieModelRenderer(this, 81, 45);
        Hand_Left_Claw_Middle.addBox(-0.5F, 1F, -1.2F, 1, 2, 1);
        Hand_Left_Claw_Middle.setRotationPoint(5F, 14F, -6.8F);
        Hand_Left_Claw_Middle.setTextureSize(256, 256);
        Hand_Left_Claw_Middle.mirror = true;
        setRotation(Hand_Left_Claw_Middle, 0F, -0.4014257F, 0F);
        Hand_Right_Claw_Right = new MowzieModelRenderer(this, 81, 45);
        Hand_Right_Claw_Right.addBox(-0.2F, 1F, -0.5F, 1, 2, 1);
        Hand_Right_Claw_Right.setRotationPoint(-5F, 14F, -6.8F);
        Hand_Right_Claw_Right.setTextureSize(256, 256);
        Hand_Right_Claw_Right.mirror = true;
        setRotation(Hand_Right_Claw_Right, -0.4712389F, 1.972222F, 0F);
        Hand_Right_Claw_Left = new MowzieModelRenderer(this, 81, 45);
        Hand_Right_Claw_Left.addBox(-0.2F, 1F, -0.5F, 1, 2, 1);
        Hand_Right_Claw_Left.setRotationPoint(-5F, 14F, -6.8F);
        Hand_Right_Claw_Left.setTextureSize(256, 256);
        Hand_Right_Claw_Left.mirror = true;
        setRotation(Hand_Right_Claw_Left, 0.4712389F, 1.972222F, 0F);
        Hand_Right_Claw_Middle = new MowzieModelRenderer(this, 81, 45);
        Hand_Right_Claw_Middle.addBox(-0.5F, 1F, -1.2F, 1, 2, 1);
        Hand_Right_Claw_Middle.setRotationPoint(-5F, 14F, -6.8F);
        Hand_Right_Claw_Middle.setTextureSize(256, 256);
        Hand_Right_Claw_Middle.mirror = true;
        setRotation(Hand_Right_Claw_Middle, 0F, 0.4014257F, 0F);
        Foot_Left = new MowzieModelRenderer(this, 0, 0);
        Foot_Left.addBox(-1.5F, 0F, -4F, 3, 2, 6);
        Foot_Left.setRotationPoint(6F, 22F, 6.5F);
        Foot_Left.setTextureSize(256, 256);
        Foot_Left.mirror = true;
        setRotation(Foot_Left, 0F, 0F, 0F);
        Foot_Right = new MowzieModelRenderer(this, 0, 0);
        Foot_Right.addBox(-1.5F, 0F, -4F, 3, 2, 6);
        Foot_Right.setRotationPoint(-6F, 22F, 6.5F);
        Foot_Right.setTextureSize(256, 256);
        Foot_Right.mirror = true;
        setRotation(Foot_Right, 0F, 0F, 0F);
        Left_Claw_1 = new MowzieModelRenderer(this, 0, 30);
        Left_Claw_1.addBox(0F, -3F, 0F, 1, 3, 1);
        Left_Claw_1.setRotationPoint(4.6F, 23.5F, 5F);
        Left_Claw_1.setTextureSize(256, 256);
        Left_Claw_1.mirror = true;
        setRotation(Left_Claw_1, 0.0847731F, 0F, 0F);
        Left_Claw_2 = new MowzieModelRenderer(this, 0, 30);
        Left_Claw_2.addBox(0F, 0F, 0F, 1, 2, 1);
        Left_Claw_2.setRotationPoint(4.6F, 20.4F, 5.9F);
        Left_Claw_2.setTextureSize(256, 256);
        Left_Claw_2.mirror = true;
        setRotation(Left_Claw_2, -1.869996F, 0F, 0F);
        Right_Claw_1 = new MowzieModelRenderer(this, 0, 30);
        Right_Claw_1.addBox(-1F, -3F, 0F, 1, 3, 1);
        Right_Claw_1.setRotationPoint(-4.6F, 23.5F, 5F);
        Right_Claw_1.setTextureSize(256, 256);
        Right_Claw_1.mirror = true;
        setRotation(Right_Claw_1, 0.0847731F, 0F, 0F);
        Right_Claw_2 = new MowzieModelRenderer(this, 0, 30);
        Right_Claw_2.addBox(-1F, 0F, 0F, 1, 2, 1);
        Right_Claw_2.setRotationPoint(-4.6F, 20.4F, 5.9F);
        Right_Claw_2.setTextureSize(256, 256);
        Right_Claw_2.mirror = true;
        setRotation(Right_Claw_2, -1.869996F, 0F, 0F);
        Quill_1 = new MowzieModelRenderer(this, 0, 18);
        Quill_1.addBox(0F, 0F, 0F, 0, 3, 1);
        Quill_1.setRotationPoint(0.5F, -4.8F, -16.3F);
        Quill_1.setTextureSize(256, 256);
        Quill_1.mirror = true;
        setRotation(Quill_1, 2.393595F, 0F, 0F);
        Quill_2 = new MowzieModelRenderer(this, 0, 18);
        Quill_2.addBox(0F, 0F, 0F, 0, 3, 1);
        Quill_2.setRotationPoint(0.7F, -4.2F, -15F);
        Quill_2.setTextureSize(256, 256);
        Quill_2.mirror = true;
        setRotation(Quill_2, 2.393595F, 0F, 0F);
        Quill_3 = new MowzieModelRenderer(this, 0, 18);
        Quill_3.addBox(0F, 0F, 0F, 0, 3, 1);
        Quill_3.setRotationPoint(-0.7F, -4.2F, -15F);
        Quill_3.setTextureSize(256, 256);
        Quill_3.mirror = true;
        setRotation(Quill_3, 2.393595F, 0F, 0F);
        Quill_4 = new MowzieModelRenderer(this, 0, 18);
        Quill_4.addBox(0F, 0F, 0F, 0, 3, 1);
        Quill_4.setRotationPoint(1F, -3F, -14F);
        Quill_4.setTextureSize(256, 256);
        Quill_4.mirror = true;
        setRotation(Quill_4, 2.393595F, 0F, 0F);
        Quill_5 = new MowzieModelRenderer(this, 0, 18);
        Quill_5.addBox(0F, 0F, 0F, 0, 3, 1);
        Quill_5.setRotationPoint(-1F, -3F, -14F);
        Quill_5.setTextureSize(256, 256);
        Quill_5.mirror = true;
        setRotation(Quill_5, 2.393595F, 0F, 0F);
        Quill_6 = new MowzieModelRenderer(this, 0, 18);
        Quill_6.addBox(0F, 0F, 0F, 0, 3, 1);
        Quill_6.setRotationPoint(-0.5F, -4.8F, -16.3F);
        Quill_6.setTextureSize(256, 256);
        Quill_6.mirror = true;
        setRotation(Quill_6, 2.393595F, 0F, 0F);
        Quill_7 = new MowzieModelRenderer(this, 0, 18);
        Quill_7.addBox(0F, 0F, 0F, 0, 3, 1);
        Quill_7.setRotationPoint(0F, -4.8F, -18F);
        Quill_7.setTextureSize(256, 256);
        Quill_7.mirror = true;
        setRotation(Quill_7, 2.393595F, 0F, 0F);
        HeadJoint = new MowzieModelRenderer(this, 0, 0);
        HeadJoint.addBox(0F, 0F, 0F, 0, 0, 0);
        HeadJoint.setRotationPoint(0F, -6F, -15F);
        HeadJoint.setTextureSize(256, 256);
        HeadJoint.mirror = true;
        setRotation(HeadJoint, 0F, 0F, 0F);

        addChildTo(Left_Claw_2, Left_Claw_1);
        addChildTo(Left_Claw_1, Foot_Left);
        addChildTo(Foot_Left, Left_Upper_Foot);
        addChildTo(Left_Upper_Foot, Left_Calf_1);
        addChildTo(Left_Calf_1, Left_Thigh);

        addChildTo(Right_Claw_2, Right_Claw_1);
        addChildTo(Right_Claw_1, Foot_Right);
        addChildTo(Foot_Right, Right_Upper_Foot);
        addChildTo(Right_Upper_Foot, Right_Calf_1);
        addChildTo(Right_Calf_1, Right_Thigh);

        addChildTo(Lower_Jaw, Head);
        addChildTo(Upper_Jaw, Head);
        addChildTo(Quill_1, Head);
        addChildTo(Quill_6, Head);
        addChildTo(Quill_7, Head);
        addChildTo(Head, HeadJoint);
        addChildTo(HeadJoint, Neck);
        /*   
         addChildTo(Quill_2, Head);
        addChildTo(Quill_3, Head);
        addChildTo(Quill_4, Head);
        addChildTo(Quill_5, Head);
        */
        addChildTo(Neck, Body_2);
        addChildTo(Body_2, Body_1);

        addChildTo(Hand_Left_Claw_Left, Hand_Left);
        addChildTo(Hand_Left_Claw_Middle, Hand_Left);
        addChildTo(Hand_Left_Claw_Right, Hand_Left);
        addChildTo(Hand_Left, Lower_Arm_Left);
        addChildTo(Lower_Arm_Left, Upper_Arm_Left);
        addChildTo(Upper_Arm_Left, Body_1);

        addChildTo(Hand_Right_Claw_Left, Hand_Right);
        addChildTo(Hand_Right_Claw_Middle, Hand_Right);
        addChildTo(Hand_Right_Claw_Right, Hand_Right);
        addChildTo(Hand_Right, Lower_Arm_Right);
        addChildTo(Lower_Arm_Right, Upper_Arm_Right);
        addChildTo(Upper_Arm_Right, Body_1);

        addChildTo(Tail_6, Tail_5);
        addChildTo(Tail_5, Tail_4);
        addChildTo(Tail_4, Tail_3);
        addChildTo(Tail_3, Tail_2);
        addChildTo(Tail_2, Tail_1);
        addChildTo(Tail_1, Body_1);

        //Corrections
        Left_Claw_2.setRotationPoint(0, -3, 1);
        Right_Claw_2.setRotationPoint(0, -3, 1);
        HeadJoint.setRotationPoint(0, 0, -13);
        Tail_6.setRotationPoint(0, 1, 11);

        Tail_1.rotateAngleX = 0.3F;
        Tail_2.rotateAngleX = 0F;
        Tail_3.rotateAngleX = -0.03F;
        Tail_4.rotateAngleX = -0.06F;
        Tail_5.rotateAngleX = -0.09F;
        Tail_6.rotateAngleX = -0.12F;

        Head.setRotationPoint(0, 0, 0);
        Body_2.setRotationPoint(0, -1, -20);
        Hand_Left_Claw_Left.setRotationPoint(0.2F, -0.2F, -0.1F);
        Hand_Left_Claw_Middle.setRotationPoint(0F, -0.2F, -0.1F);
        Hand_Left_Claw_Right.setRotationPoint(-0.2F, -0.2F, -0.1F);
        Hand_Right_Claw_Left.setRotationPoint(0.2F, -0.2F, -0.1F);
        Hand_Right_Claw_Middle.setRotationPoint(0F, -0.2F, -0.1F);
        Hand_Right_Claw_Right.setRotationPoint(-0.2F, -0.2F, -0.1F);

        rightArmParts = new MowzieModelRenderer[]{this.Hand_Right, this.Lower_Arm_Right, this.Upper_Arm_Right};
        leftArmParts = new MowzieModelRenderer[]{this.Hand_Left, this.Lower_Arm_Left, this.Upper_Arm_Left};
        tailParts = new MowzieModelRenderer[]{this.Tail_6, this.Tail_5, this.Tail_4, this.Tail_3, this.Tail_2, this.Tail_1};

        Left_Upper_Foot.setInitValuesToCurrentPose();
        Right_Upper_Foot.setInitValuesToCurrentPose();
        Left_Calf_1.setInitValuesToCurrentPose();
        Right_Calf_1.setInitValuesToCurrentPose();
        Left_Thigh.setInitValuesToCurrentPose();
        Right_Thigh.setInitValuesToCurrentPose();
        Body_1.setInitValuesToCurrentPose();
        Body_2.setInitValuesToCurrentPose();
        Neck.setInitValuesToCurrentPose();
        Head.setInitValuesToCurrentPose();
        Upper_Jaw.setInitValuesToCurrentPose();
        Lower_Jaw.setInitValuesToCurrentPose();
        Tail_1.setInitValuesToCurrentPose();
        Tail_2.setInitValuesToCurrentPose();
        Tail_3.setInitValuesToCurrentPose();
        Tail_4.setInitValuesToCurrentPose();
        Tail_5.setInitValuesToCurrentPose();
        Tail_6.setInitValuesToCurrentPose();
        Upper_Arm_Right.setInitValuesToCurrentPose();
        Upper_Arm_Left.setInitValuesToCurrentPose();
        Lower_Arm_Left.setInitValuesToCurrentPose();
        Lower_Arm_Right.setInitValuesToCurrentPose();
        Hand_Left.setInitValuesToCurrentPose();
        Hand_Right.setInitValuesToCurrentPose();
        Hand_Left_Claw_Left.setInitValuesToCurrentPose();
        Hand_Left_Claw_Right.setInitValuesToCurrentPose();
        Hand_Left_Claw_Middle.setInitValuesToCurrentPose();
        Hand_Right_Claw_Right.setInitValuesToCurrentPose();
        Hand_Right_Claw_Left.setInitValuesToCurrentPose();
        Hand_Right_Claw_Middle.setInitValuesToCurrentPose();
        Foot_Left.setInitValuesToCurrentPose();
        Foot_Right.setInitValuesToCurrentPose();
        Left_Claw_1.setInitValuesToCurrentPose();
        Left_Claw_2.setInitValuesToCurrentPose();
        Right_Claw_1.setInitValuesToCurrentPose();
        Right_Claw_2.setInitValuesToCurrentPose();
        Quill_1.setInitValuesToCurrentPose();
        Quill_2.setInitValuesToCurrentPose();
        Quill_3.setInitValuesToCurrentPose();
        Quill_4.setInitValuesToCurrentPose();
        Quill_5.setInitValuesToCurrentPose();
        Quill_6.setInitValuesToCurrentPose();
        Quill_7.setInitValuesToCurrentPose();
        HeadJoint.setInitValuesToCurrentPose();
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        /*    Left_Upper_Foot.render(f5);
            Right_Upper_Foot.render(f5);
            Left_Calf_1.render(f5);
            Right_Calf_1.render(f5);*/
        Left_Thigh.render(f5);
        Right_Thigh.render(f5);
        Body_1.render(f5);
        //    Body_2.render(f5);
        //    Neck.render(f5);
        //    Head.render(f5);
        //    Upper_Jaw.render(f5);
        //    Lower_Jaw.render(f5);
        /*    Tail_1.render(f5);
            Tail_2.render(f5);
            Tail_3.render(f5);
            Tail_4.render(f5);
            Tail_5.render(f5);
            Tail_6.render(f5);*/
        /*    Upper_Arm_Right.render(f5);
            Upper_Arm_Left.render(f5);
            Lower_Arm_Left.render(f5);
            Lower_Arm_Right.render(f5);
            Hand_Left.render(f5);
            Hand_Right.render(f5);
            Hand_Left_Claw_Left.render(f5);
            Hand_Left_Claw_Right.render(f5);
            Hand_Left_Claw_Middle.render(f5);
            Hand_Right_Claw_Right.render(f5);
            Hand_Right_Claw_Left.render(f5);
            Hand_Right_Claw_Middle.render(f5);*/
        //    Foot_Left.render(f5);
        //    Foot_Right.render(f5);
        //    Left_Claw_1.render(f5);
        //    Left_Claw_2.render(f5);
        //    Right_Claw_1.render(f5);
        //    Right_Claw_2.render(f5);
        /*    Quill_1.render(f5);
            Quill_2.render(f5);
            Quill_3.render(f5);
            Quill_4.render(f5);
            Quill_5.render(f5);
            Quill_6.render(f5);
            Quill_7.render(f5);*/
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    private void resetPose()
    {
        Left_Upper_Foot.setCurrentPoseToInitValues();
        Right_Upper_Foot.setCurrentPoseToInitValues();
        Left_Calf_1.setCurrentPoseToInitValues();
        Right_Calf_1.setCurrentPoseToInitValues();
        Left_Thigh.setCurrentPoseToInitValues();
        Right_Thigh.setCurrentPoseToInitValues();
        Body_1.setCurrentPoseToInitValues();
        Body_2.setCurrentPoseToInitValues();
        Neck.setCurrentPoseToInitValues();
        Head.setCurrentPoseToInitValues();
        Upper_Jaw.setCurrentPoseToInitValues();
        Lower_Jaw.setCurrentPoseToInitValues();
        Tail_1.setCurrentPoseToInitValues();
        Tail_2.setCurrentPoseToInitValues();
        Tail_3.setCurrentPoseToInitValues();
        Tail_4.setCurrentPoseToInitValues();
        Tail_5.setCurrentPoseToInitValues();
        Tail_6.setCurrentPoseToInitValues();
        Upper_Arm_Right.setCurrentPoseToInitValues();
        Upper_Arm_Left.setCurrentPoseToInitValues();
        Lower_Arm_Left.setCurrentPoseToInitValues();
        Lower_Arm_Right.setCurrentPoseToInitValues();
        Hand_Left.setCurrentPoseToInitValues();
        Hand_Right.setCurrentPoseToInitValues();
        Hand_Left_Claw_Left.setCurrentPoseToInitValues();
        Hand_Left_Claw_Right.setCurrentPoseToInitValues();
        Hand_Left_Claw_Middle.setCurrentPoseToInitValues();
        Hand_Right_Claw_Right.setCurrentPoseToInitValues();
        Hand_Right_Claw_Left.setCurrentPoseToInitValues();
        Hand_Right_Claw_Middle.setCurrentPoseToInitValues();
        Foot_Left.setCurrentPoseToInitValues();
        Foot_Right.setCurrentPoseToInitValues();
        Left_Claw_1.setCurrentPoseToInitValues();
        Left_Claw_2.setCurrentPoseToInitValues();
        Right_Claw_1.setCurrentPoseToInitValues();
        Right_Claw_2.setCurrentPoseToInitValues();
        Quill_1.setCurrentPoseToInitValues();
        Quill_2.setCurrentPoseToInitValues();
        Quill_3.setCurrentPoseToInitValues();
        Quill_4.setCurrentPoseToInitValues();
        Quill_5.setCurrentPoseToInitValues();
        Quill_6.setCurrentPoseToInitValues();
        Quill_7.setCurrentPoseToInitValues();
        HeadJoint.setCurrentPoseToInitValues();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityVelociraptor raptor)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
        this.resetPose();
        /*
         * f = raptor.frame; f1 = 1F;
         */
        if (raptor.leaping)
            f1 = 0;
        if (raptor.getAnimationId() == JurassiCraftAnimationIDs.LEAP.animID() && raptor.getAnimationTick() >= 6)
            f1 = 0;
        float scaleFactor = 0.75F;
        float height = 2F * f1;

        bob(Body_1, 1F * scaleFactor, height, false, f, f1);
        bob(Left_Thigh, 1F * scaleFactor, height, false, f, f1);
        bob(Right_Thigh, 1F * scaleFactor, height, false, f, f1);
        bob(Neck, 1F * scaleFactor, height / 2, false, f, f1);

        walk(Neck, 1F * scaleFactor, 0.25F, false, 1F, 0.4F, f, f1);
        walk(Head, 1F * scaleFactor, 0.25F, true, 1F, -0.4F, f, f1);

        walk(Left_Thigh, 0.5F * scaleFactor, 0.8F, false, 0F, 0.4F, f, f1);
        walk(Left_Calf_1, 0.5F * scaleFactor, 0.5F, true, 1F, 0F, f, f1);
        walk(Left_Upper_Foot, 0.5F * scaleFactor, 0.5F, false, 0F, 0F, f, f1);
        walk(Foot_Left, 0.5F * scaleFactor, 1.5F, true, 0.5F, 1F, f, f1);

        walk(Right_Thigh, 0.5F * scaleFactor, 0.8F, true, 0F, 0.4F, f, f1);
        walk(Right_Calf_1, 0.5F * scaleFactor, 0.5F, false, 1F, 0F, f, f1);
        walk(Right_Upper_Foot, 0.5F * scaleFactor, 0.5F, true, 0F, 0F, f, f1);
        walk(Foot_Right, 0.5F * scaleFactor, 1.5F, false, 0.5F, 1F, f, f1);

        chainSwing(tailParts, 0.5F * scaleFactor, -0.1F, 2, f, f1);
        chainWave(tailParts, 1F * scaleFactor, -0.05F, 2, f, f1);
        chainWave(rightArmParts, 1F * scaleFactor, -0.3F, 4, f, f1);
        chainWave(leftArmParts, 1F * scaleFactor, -0.3F, 4, f, f1);

        float sittingProgress = raptor.sittingProgress.getAnimationProgressSin();

        if (sittingProgress > 0.001F)
        {
            //Sitting Pose
            float sittingProgressTemporary = raptor.sittingProgress.getAnimationProgressTemporaryFS();

            this.faceTarget(Head, 5, f3, f4);
            this.faceTarget(Neck, 4, f3, f4);

            this.Body_1.rotationPointY += 13.25F * sittingProgress;
            this.Right_Thigh.rotationPointY += 14.25F * sittingProgress;
            this.Left_Thigh.rotationPointY += 14.25F * sittingProgress;
            this.Right_Thigh.rotationPointZ += 0.5F * sittingProgress;
            this.Left_Thigh.rotationPointZ += 0.5F * sittingProgress;

            if (sittingProgressTemporary > 0.001F)
            {
                this.Body_1.rotateAngleX += 0.1F * sittingProgressTemporary;
                this.Neck.rotateAngleX += 0.4F * sittingProgressTemporary;
                this.Head.rotateAngleX += 0.2F * sittingProgressTemporary;
                this.Upper_Arm_Right.rotateAngleX += 0.5F * sittingProgressTemporary;
                this.Upper_Arm_Left.rotateAngleX += 0.5F * sittingProgressTemporary;

                if (raptor.isSitting())
                {
                    this.Tail_1.rotateAngleX += 0.1F * sittingProgressTemporary;
                    this.Tail_2.rotateAngleX += 0.1F * sittingProgressTemporary;
                    this.Tail_3.rotateAngleX += 0.1F * sittingProgressTemporary;
                    this.Tail_4.rotateAngleX += 0.1F * sittingProgressTemporary;
                    this.Tail_5.rotateAngleX += 0.1F * sittingProgressTemporary;
                }
                else
                {
                    this.Tail_1.rotateAngleX -= 0.1F * sittingProgressTemporary;
                    this.Tail_2.rotateAngleX -= 0.1F * sittingProgressTemporary;
                    this.Tail_3.rotateAngleX -= 0.1F * sittingProgressTemporary;
                    this.Tail_4.rotateAngleX -= 0.1F * sittingProgressTemporary;
                    this.Tail_5.rotateAngleX -= 0.1F * sittingProgressTemporary;
                }
            }

            this.Body_1.rotateAngleX -= 0.075F * sittingProgress;

            this.Upper_Arm_Right.rotateAngleX -= 0.8F * sittingProgress;
            this.Upper_Arm_Left.rotateAngleX -= 0.8F * sittingProgress;

            this.Right_Thigh.rotateAngleX -= 0.75F * sittingProgress;
            this.Left_Thigh.rotateAngleX -= 0.75F * sittingProgress;

            this.Right_Calf_1.rotationPointZ += 0.5F * sittingProgress;
            this.Left_Calf_1.rotationPointZ += 0.5F * sittingProgress;
            this.Right_Calf_1.rotationPointY += 1.5F * sittingProgress;
            this.Left_Calf_1.rotationPointY += 1.5F * sittingProgress;
            this.Right_Calf_1.rotateAngleX += 1.2F * sittingProgress;
            this.Left_Calf_1.rotateAngleX += 1.2F * sittingProgress;

            this.Right_Upper_Foot.rotationPointZ -= 0.6F * sittingProgress;
            this.Left_Upper_Foot.rotationPointZ -= 0.6F * sittingProgress;
            this.Right_Upper_Foot.rotateAngleX -= 1.45F * sittingProgress;
            this.Left_Upper_Foot.rotateAngleX -= 1.45F * sittingProgress;

            this.Foot_Right.rotationPointZ -= 0.5F * sittingProgress;
            this.Foot_Left.rotationPointZ -= 0.5F * sittingProgress;
            this.Foot_Right.rotateAngleX += 1.0F * sittingProgress;
            this.Foot_Left.rotateAngleX += 1.0F * sittingProgress;

            this.Right_Claw_1.rotateAngleX += 0.7F * sittingProgress;
            this.Left_Claw_1.rotateAngleX += 0.7F * sittingProgress;

            //Idling
            this.chainWave(this.tailParts, 0.1F, -0.05F, 2, raptor.frame, 1.0F - 0.5F * sittingProgress);
            this.walk(this.Neck, 0.1F, 0.07F, false, -1F, 0F, raptor.frame, 1F - 0.3F * sittingProgress);
            this.walk(this.Head, 0.1F, 0.07F, true, 0F, 0F, raptor.frame, 1F - 0.3F * sittingProgress);
            this.walk(this.Body_1, 0.1F, 0.05F, false, 0F, 0F, raptor.frame, 1.0F - 0.7F * sittingProgress);
            this.chainWave(this.rightArmParts, 0.1F, -0.1F, 4, raptor.frame, 1.0F - 0.5F * sittingProgress);
            this.chainWave(this.leftArmParts, 0.1F, -0.1F, 4, raptor.frame, 1.0F - 0.5F * sittingProgress);
        }
        else
        {
            this.faceTarget(this.Head, 2, f3, f4);
            this.faceTarget(this.Neck, 2, f3, f4);

            //Idling
            this.chainWave(this.tailParts, 0.1F, -0.05F, 2, raptor.frame, 1F);
            this.walk(this.Neck, 0.1F, 0.07F, false, -1F, 0F, raptor.frame, 1F);
            this.walk(this.Head, 0.1F, 0.07F, true, 0F, 0F, raptor.frame, 1F);
            this.walk(this.Body_1, 0.1F, 0.05F, false, 0F, 0F, raptor.frame, 1F);
            this.chainWave(this.rightArmParts, 0.1F, -0.1F, 4, raptor.frame, 1F);
            this.chainWave(this.leftArmParts, 0.1F, -0.1F, 4, raptor.frame, 1F);
        }

        raptor.tailBuffer.applyChainSwingBuffer(this.tailParts);

        if (raptor.getAnimationTick() == 20 && raptor.getAnimationId() == JurassiCraftAnimationIDs.LEAP.animID())
            raptor.setLeaping(true);

        if (raptor.leaping == true)
        {
            Body_1.rotateAngleX -= 0.8;
            Neck.rotateAngleX += 0.8;
            Neck.rotationPointY -= 2;
            Neck.rotationPointZ -= 3;
            Head.rotateAngleX += 0.5;
            Lower_Jaw.rotateAngleX += 0.7;
            Tail_1.rotationPointZ -= 2;
            Tail_1.rotateAngleX += 0.7F;

            Right_Thigh.rotateAngleX -= 1.2;
            Left_Thigh.rotateAngleX -= 1.2;
            Right_Calf_1.rotateAngleX -= 0.3;
            Left_Calf_1.rotateAngleX -= 0.3;
            Right_Upper_Foot.rotateAngleX += 0.3;
            Left_Upper_Foot.rotateAngleX += 0.3;
            Foot_Right.rotateAngleX -= 0.3;
            Foot_Left.rotateAngleX -= 0.3;

            Upper_Arm_Right.rotateAngleX -= 0.5F;
            Upper_Arm_Right.rotateAngleZ += 1F;
            Upper_Arm_Left.rotateAngleX -= 0.5F;
            Upper_Arm_Left.rotateAngleZ -= 1F;
            Lower_Arm_Right.rotateAngleX += 0.5F;
            Lower_Arm_Right.rotateAngleY += 1.5F;
            Lower_Arm_Left.rotateAngleX += 0.5F;
            Lower_Arm_Left.rotateAngleY -= 1.5F;
            Hand_Right.rotateAngleX -= 1;
            Hand_Left.rotateAngleX -= 1;
        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.animator.update(entity);
        setRotationAngles(f, f1, f2, f3, f4, f5, (EntityVelociraptor) entity);
        EntityVelociraptor raptor = (EntityVelociraptor) entity;

        if (raptor.getAnimationId() == JurassiCraftAnimationIDs.TWITCH_HEAD.animID())
        {
            if (raptor.getAnimationTick() == 1 && raptor.getAnimationId() == JurassiCraftAnimationIDs.TWITCH_HEAD.animID())
                TwitchAngle = (float) (Math.random() - 0.5);
            this.animator.setAnimation(JurassiCraftAnimationIDs.TWITCH_HEAD.animID());
            this.animator.startPhase(3);
            this.animator.rotate(Head, 0, 0, TwitchAngle);
            this.animator.endPhase();
            this.animator.setStationaryPhase(24);
            this.animator.resetPhase(3);
        }

        if (raptor.getAnimationId() == JurassiCraftAnimationIDs.ROAR.animID())
        {
            this.animator.setAnimation(JurassiCraftAnimationIDs.ROAR.animID());
            this.animator.startPhase(3);
            this.animator.rotate(Neck, -0.1F, 0, 0);
            this.animator.rotate(Head, 0.1F, 0, 0);
            this.animator.endPhase();
            this.animator.startPhase(3);
            this.animator.rotate(Neck, 0.4F, 0, 0);
            this.animator.rotate(Head, -0.4F, 0, 0);
            this.animator.rotate(Lower_Jaw, 0.3F, 0, 0);
            this.animator.endPhase();
            this.animator.setStationaryPhase(9);
            this.animator.resetPhase(5);
        }

        if (raptor.getAnimationId() == JurassiCraftAnimationIDs.LEAP.animID())
        {
            this.animator.setAnimation(JurassiCraftAnimationIDs.LEAP.animID());
            this.animator.startPhase(5);
            this.animator.move(Body_1, 0, 3, 0);
            this.animator.rotate(Body_1, 0.5F, 0, 0);
            this.animator.rotate(Tail_1, 0.4F, 0, 0);
            this.animator.move(Tail_1, 0, 0, -2);
            this.animator.rotate(Neck, -0.5F, 0, 0);
            this.animator.move(Right_Thigh, 0, 3, 0);
            this.animator.move(Left_Thigh, 0, 3, 0);
            this.animator.rotate(Right_Thigh, -0.2F, 0.4F, 0);
            this.animator.rotate(Left_Thigh, -0.2F, -0.4F, 0);
            this.animator.rotate(Right_Calf_1, 0.2F, 0, 0);
            this.animator.rotate(Left_Calf_1, 0.2F, 0, 0);
            this.animator.rotate(Right_Upper_Foot, -0.2F, 0, 0);
            this.animator.rotate(Left_Upper_Foot, -0.2F, 0, 0);
            this.animator.rotate(Foot_Right, 0.2F, 0, 0);
            this.animator.rotate(Foot_Left, 0.2F, 0, 0);
            this.animator.endPhase();
            this.animator.setStationaryPhase(5);
            this.animator.startPhase(4);
            this.animator.move(Body_1, 0, -3, 0);
            this.animator.move(Tail_1, 0, 0, 0);
            this.animator.rotate(Tail_1, -0.4F, 0, 0);
            this.animator.move(Right_Thigh, 0, -3, 0);
            this.animator.move(Left_Thigh, 0, -3, 0);
            this.animator.rotate(Right_Thigh, 1F, 0, 0);
            this.animator.rotate(Left_Thigh, 1F, 0, 0);
            this.animator.rotate(Right_Calf_1, -1F, 0, 0);
            this.animator.rotate(Left_Calf_1, -1F, 0, 0);
            this.animator.rotate(Right_Upper_Foot, 1F, 0, 0);
            this.animator.rotate(Left_Upper_Foot, 1F, 0, 0);
            this.animator.rotate(Foot_Right, -1F, 0, 0);
            this.animator.rotate(Foot_Left, -1F, 0, 0);
            this.animator.endPhase();
            this.animator.startPhase(2);
            this.animator.rotate(Body_1, -0.8F, 0, 0);
            this.animator.rotate(Neck, 0.8F, 0, 0);
            this.animator.rotate(Head, 0.5F, 0, 0);
            this.animator.rotate(Lower_Jaw, 0.7F, 0, 0);
            this.animator.move(Tail_1, 0, 0, -2);
            this.animator.rotate(Tail_1, 0.7F, 0, 0);
            this.animator.move(Neck, 0, -2, -3);
            this.animator.rotate(Right_Thigh, -1.2F, 0, 0);
            this.animator.rotate(Left_Thigh, -1.2F, 0, 0);
            this.animator.rotate(Right_Calf_1, -0.3F, 0, 0);
            this.animator.rotate(Left_Calf_1, -0.3F, 0, 0);
            this.animator.rotate(Right_Upper_Foot, 0.3F, 0, 0);
            this.animator.rotate(Left_Upper_Foot, 0.3F, 0, 0);
            this.animator.rotate(Foot_Right, -0.3F, 0, 0);
            this.animator.rotate(Foot_Left, -0.3F, 0, 0);
            this.animator.rotate(Upper_Arm_Right, -0.5F, 0, 1);
            this.animator.rotate(Upper_Arm_Left, -0.5F, 0, -1);
            this.animator.rotate(Lower_Arm_Right, 0.5F, 1.5F, 0);
            this.animator.rotate(Lower_Arm_Left, 0.5F, -1.5F, 0);
            this.animator.rotate(Hand_Right, -1, 0, 0);
            this.animator.rotate(Hand_Left, -1, 0, 0);
            this.animator.endPhase();
            this.animator.setStationaryPhase(4);
            this.animator.resetPhase(0);
        }

        if (raptor.getAnimationId() == JurassiCraftAnimationIDs.BITE.animID())
        {
            this.animator.setAnimation(JurassiCraftAnimationIDs.BITE.animID());
            this.animator.startPhase(3);
            this.animator.rotate(Neck, -0.3F, 0, 0);
            this.animator.rotate(Head, 0.3F, 0, 0);
            this.animator.rotate(Lower_Jaw, 0.4F, 0, 0);
            this.animator.endPhase();
            this.animator.startPhase(2);
            this.animator.rotate(Neck, 0.6F, 0, 0);
            this.animator.rotate(Head, -0.6F, 0, 0);
            this.animator.endPhase();
            this.animator.setStationaryPhase(1);
            this.animator.resetPhase(4);
        }
    }
}

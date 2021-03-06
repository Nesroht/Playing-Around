package ase;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Furnace - Nesroht
 * Created using Tabula 4.1.1
 */
public class Furnace extends ModelBase {
    public ModelRenderer bottom;
    public ModelRenderer top;
    public ModelRenderer topside;
    public ModelRenderer topside_1;
    public ModelRenderer topside_2;
    public ModelRenderer topside_3;
    public ModelRenderer shape40;
    public ModelRenderer shape40_1;
    public ModelRenderer shape42;
    public ModelRenderer shape42_1;
    public ModelRenderer shape40_2;
    public ModelRenderer shape40_3;
    public ModelRenderer shape40_4;
    public ModelRenderer shape40_5;
    public ModelRenderer cuboid;
    public ModelRenderer cuboid_1;
    public ModelRenderer cuboid_2;
    public ModelRenderer cuboidsmall;
    public ModelRenderer cuboidsmall_1;
    public ModelRenderer cuboidsmall_2;
    public ModelRenderer cuboidsmall_3;
    public ModelRenderer cuboid_3;
    public ModelRenderer cuboidsmall_4;
    public ModelRenderer cuboidsmall_5;
    public ModelRenderer cuboidsmall_6;
    public ModelRenderer cuboidsmall_7;
    public ModelRenderer cuboidsmall_8;
    public ModelRenderer cuboidsmall_9;
    public ModelRenderer cuboidsmall_10;
    public ModelRenderer cuboidsmall_11;
    public ModelRenderer cuboidsmall_12;
    public ModelRenderer cuboidsmall_13;
    public ModelRenderer cuboid_4;
    public ModelRenderer cuboid_5;
    public ModelRenderer cuboid_6;
    public ModelRenderer cuboidsmall_14;
    public ModelRenderer cuboidsmall_15;
    public ModelRenderer cuboidsmall_16;
    public ModelRenderer cuboidsmall_17;
    public ModelRenderer cuboid_7;
    public ModelRenderer cuboidsmall_18;
    public ModelRenderer cuboidsmall_19;
    public ModelRenderer cuboidsmall_20;
    public ModelRenderer cuboidsmall_21;
    public ModelRenderer cuboidsmall_22;
    public ModelRenderer cuboidsmall_23;
    public ModelRenderer cuboidsmall_24;
    public ModelRenderer cuboidsmall_25;
    public ModelRenderer cuboidsmall_26;
    public ModelRenderer cuboidsmall_27;
    public ModelRenderer cuboid_8;
    public ModelRenderer cuboid_9;
    public ModelRenderer cuboid_10;
    public ModelRenderer cuboidsmall_28;
    public ModelRenderer cuboidsmall_29;
    public ModelRenderer cuboidsmall_30;
    public ModelRenderer cuboidsmall_31;
    public ModelRenderer cuboid_11;
    public ModelRenderer cuboidsmall_32;
    public ModelRenderer cuboidsmall_33;
    public ModelRenderer cuboidsmall_34;
    public ModelRenderer cuboidsmall_35;
    public ModelRenderer cuboidsmall_36;
    public ModelRenderer cuboidsmall_37;
    public ModelRenderer cuboidsmall_38;
    public ModelRenderer cuboidsmall_39;
    public ModelRenderer cuboidsmall_40;
    public ModelRenderer cuboidsmall_41;
    public ModelRenderer cuboid_12;
    public ModelRenderer cuboid_13;
    public ModelRenderer cuboid_14;
    public ModelRenderer cuboidsmall_42;
    public ModelRenderer cuboidsmall_43;
    public ModelRenderer cuboidsmall_44;
    public ModelRenderer cuboidsmall_45;
    public ModelRenderer cuboid_15;
    public ModelRenderer cuboidsmall_46;
    public ModelRenderer cuboidsmall_47;
    public ModelRenderer cuboidsmall_48;
    public ModelRenderer cuboidsmall_49;
    public ModelRenderer cuboidsmall_50;
    public ModelRenderer cuboidsmall_51;
    public ModelRenderer cuboidsmall_52;
    public ModelRenderer cuboidsmall_53;
    public ModelRenderer cuboidsmall_54;
    public ModelRenderer cuboidsmall_55;
    public ModelRenderer BurnerBase;

    public Furnace() {
        this.textureWidth = 64;
        this.textureHeight = 128;
        this.cuboidsmall_44 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_44.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_44.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_23 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_23.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_23.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_31 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_31.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_31.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_38 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_38.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_38.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_5 = new ModelRenderer(this, 0, 26);
        this.cuboid_5.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_5.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboidsmall_1 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_1.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_11 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_11.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.topside_1 = new ModelRenderer(this, 0, 2);
        this.topside_1.setRotationPoint(1.0F, -0.9F, -1.0F);
        this.topside_1.addBox(0.0F, 0.0F, 0.0F, 6, 3, 1, 0.0F);
        this.bottom = new ModelRenderer(this, 0, 33);
        this.bottom.setRotationPoint(-8.0F, 23.0F, -8.0F);
        this.bottom.addBox(0.0F, 0.0F, 0.0F, 16, 1, 16, 0.0F);
        this.cuboidsmall_20 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_20.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_20.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_48 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_48.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_48.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_33 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_33.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_33.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_13 = new ModelRenderer(this, 0, 26);
        this.cuboid_13.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_13.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboidsmall_25 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_25.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_25.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_32 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_32.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_32.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_47 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_47.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_47.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape40_2 = new ModelRenderer(this, 0, 59);
        this.shape40_2.setRotationPoint(0.0F, 1.1F, 0.0F);
        this.shape40_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_10 = new ModelRenderer(this, 0, 26);
        this.cuboid_10.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_10.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboidsmall_36 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_36.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_36.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_50 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_50.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_50.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_43 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_43.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_43.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_2 = new ModelRenderer(this, 0, 26);
        this.cuboid_2.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_2.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboidsmall_40 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_40.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.cuboidsmall_40.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_3 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_3.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape40_4 = new ModelRenderer(this, 0, 59);
        this.shape40_4.setRotationPoint(7.0F, 1.1F, 7.0F);
        this.shape40_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape42_1 = new ModelRenderer(this, 0, 61);
        this.shape42_1.setRotationPoint(5.0F, -0.8F, 0.0F);
        this.shape42_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.cuboidsmall = new ModelRenderer(this, 0, 0);
        this.cuboidsmall.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_26 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_26.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.cuboidsmall_26.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape40_5 = new ModelRenderer(this, 0, 59);
        this.shape40_5.setRotationPoint(7.0F, 1.1F, 0.0F);
        this.shape40_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_2 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_2.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.topside_2 = new ModelRenderer(this, 0, 2);
        this.topside_2.setRotationPoint(7.0F, -0.9F, 9.0F);
        this.topside_2.addBox(0.0F, 0.0F, 0.0F, 6, 3, 1, 0.0F);
        this.setRotateAngle(topside_2, 0.0F, 3.141592653589793F, 0.0F);
        this.topside_3 = new ModelRenderer(this, 0, 6);
        this.topside_3.setRotationPoint(9.0F, -0.9F, 7.0F);
        this.topside_3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(topside_3, 0.0F, 3.141592653589793F, 0.0F);
        this.cuboid_4 = new ModelRenderer(this, 0, 26);
        this.cuboid_4.setRotationPoint(-8.0F, 11.0F, 8.0F);
        this.cuboid_4.addBox(0.0F, 1.0F, 0.0F, 2, 11, 2, 0.0F);
        this.setRotateAngle(cuboid_4, 0.0F, 1.5707963267948966F, 0.0F);
        this.cuboidsmall_5 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_5.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_1 = new ModelRenderer(this, 0, 26);
        this.cuboid_1.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_1.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboidsmall_21 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_21.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_21.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_24 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_24.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_24.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_6 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_6.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_12 = new ModelRenderer(this, 0, 26);
        this.cuboid_12.setRotationPoint(8.0F, 11.0F, -8.0F);
        this.cuboid_12.addBox(0.0F, 1.0F, 0.0F, 2, 11, 2, 0.0F);
        this.setRotateAngle(cuboid_12, 0.0F, 4.71238898038469F, 0.0F);
        this.shape40 = new ModelRenderer(this, 0, 59);
        this.shape40.setRotationPoint(0.0F, -0.9F, 2.0F);
        this.shape40.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.cuboidsmall_34 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_34.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_34.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_22 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_22.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_22.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_3 = new ModelRenderer(this, 0, 26);
        this.cuboid_3.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_3.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboidsmall_39 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_39.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_39.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_41 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_41.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.cuboidsmall_41.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.topside = new ModelRenderer(this, 0, 6);
        this.topside.setRotationPoint(-1.0F, -0.9F, 1.0F);
        this.topside.addBox(0.0F, 0.0F, 0.0F, 1, 3, 6, 0.0F);
        this.setRotateAngle(topside, 0.0F, -0.00718242611741246F, 0.0F);
        this.cuboidsmall_45 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_45.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_45.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_19 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_19.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_19.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_35 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_35.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_35.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_9 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_9.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_13 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_13.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.cuboidsmall_13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_37 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_37.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_37.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape40_3 = new ModelRenderer(this, 0, 59);
        this.shape40_3.setRotationPoint(0.0F, 1.1F, 7.0F);
        this.shape40_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_6 = new ModelRenderer(this, 0, 26);
        this.cuboid_6.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_6.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.BurnerBase = new ModelRenderer(this, 0, 50);
        this.BurnerBase.setRotationPoint(-4.0F, 22.5F, -4.0F);
        this.BurnerBase.addBox(0.0F, 0.0F, 0.0F, 8, 1, 8, 0.0F);
        this.cuboidsmall_29 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_29.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_29.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_15 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_15.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_15.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_10 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_10.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_49 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_49.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_49.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_15 = new ModelRenderer(this, 0, 26);
        this.cuboid_15.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_15.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboid_7 = new ModelRenderer(this, 0, 26);
        this.cuboid_7.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_7.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboidsmall_12 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_12.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.cuboidsmall_12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_51 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_51.setRotationPoint(0.0F, 2.0F, 1.0F);
        this.cuboidsmall_51.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_4 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_4.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid = new ModelRenderer(this, 0, 26);
        this.cuboid.setRotationPoint(-8.0F, 11.0F, -8.0F);
        this.cuboid.addBox(0.0F, 1.0F, 0.0F, 2, 11, 2, 0.0F);
        this.cuboidsmall_7 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_7.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_14 = new ModelRenderer(this, 0, 26);
        this.cuboid_14.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_14.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboidsmall_55 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_55.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.cuboidsmall_55.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_28 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_28.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_28.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_54 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_54.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.cuboidsmall_54.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_52 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_52.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_52.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_46 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_46.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_46.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_9 = new ModelRenderer(this, 0, 26);
        this.cuboid_9.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_9.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboidsmall_42 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_42.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_42.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_16 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_16.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_16.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_18 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_18.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_18.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_11 = new ModelRenderer(this, 0, 26);
        this.cuboid_11.setRotationPoint(1.0F, -1.0F, 1.0F);
        this.cuboid_11.addBox(0.0F, 1.0F, 0.0F, 2, 1, 2, 0.0F);
        this.cuboidsmall_27 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_27.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.cuboidsmall_27.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_30 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_30.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_30.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.top = new ModelRenderer(this, 0, 17);
        this.top.setRotationPoint(-4.0F, 8.9F, -4.0F);
        this.top.addBox(0.0F, 0.0F, 0.0F, 8, 1, 8, 0.0F);
        this.cuboidsmall_17 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_17.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.cuboidsmall_17.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboidsmall_14 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_14.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_14.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_8 = new ModelRenderer(this, 0, 26);
        this.cuboid_8.setRotationPoint(8.0F, 11.0F, 8.0F);
        this.cuboid_8.addBox(0.0F, 1.0F, 0.0F, 2, 11, 2, 0.0F);
        this.setRotateAngle(cuboid_8, 0.0F, 3.141592653589793F, 0.0F);
        this.cuboidsmall_53 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_53.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.cuboidsmall_53.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape42 = new ModelRenderer(this, 0, 61);
        this.shape42.setRotationPoint(2.0F, -0.8F, 0.0F);
        this.shape42.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
        this.shape40_1 = new ModelRenderer(this, 0, 59);
        this.shape40_1.setRotationPoint(0.0F, -0.9F, 5.0F);
        this.shape40_1.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.cuboidsmall_8 = new ModelRenderer(this, 0, 0);
        this.cuboidsmall_8.setRotationPoint(1.0F, 2.0F, 0.0F);
        this.cuboidsmall_8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.cuboid_13.addChild(this.cuboidsmall_44);
        this.cuboid_7.addChild(this.cuboidsmall_23);
        this.cuboid_9.addChild(this.cuboidsmall_31);
        this.cuboid_11.addChild(this.cuboidsmall_38);
        this.cuboid_4.addChild(this.cuboid_5);
        this.cuboid_1.addChild(this.cuboidsmall_1);
        this.cuboid_3.addChild(this.cuboidsmall_11);
        this.top.addChild(this.topside_1);
        this.cuboid_6.addChild(this.cuboidsmall_20);
        this.cuboid_14.addChild(this.cuboidsmall_48);
        this.cuboid_10.addChild(this.cuboidsmall_33);
        this.cuboid_12.addChild(this.cuboid_13);
        this.cuboid_7.addChild(this.cuboidsmall_25);
        this.cuboid_10.addChild(this.cuboidsmall_32);
        this.cuboid_14.addChild(this.cuboidsmall_47);
        this.top.addChild(this.shape40_2);
        this.cuboid_9.addChild(this.cuboid_10);
        this.cuboid_11.addChild(this.cuboidsmall_36);
        this.cuboid_15.addChild(this.cuboidsmall_50);
        this.cuboid_13.addChild(this.cuboidsmall_43);
        this.cuboid_1.addChild(this.cuboid_2);
        this.cuboid_11.addChild(this.cuboidsmall_40);
        this.cuboid_1.addChild(this.cuboidsmall_3);
        this.top.addChild(this.shape40_4);
        this.top.addChild(this.shape42_1);
        this.cuboid_1.addChild(this.cuboidsmall);
        this.cuboid_7.addChild(this.cuboidsmall_26);
        this.top.addChild(this.shape40_5);
        this.cuboid_1.addChild(this.cuboidsmall_2);
        this.top.addChild(this.topside_2);
        this.top.addChild(this.topside_3);
        this.cuboid_2.addChild(this.cuboidsmall_5);
        this.cuboid.addChild(this.cuboid_1);
        this.cuboid_6.addChild(this.cuboidsmall_21);
        this.cuboid_7.addChild(this.cuboidsmall_24);
        this.cuboid_2.addChild(this.cuboidsmall_6);
        this.top.addChild(this.shape40);
        this.cuboid_10.addChild(this.cuboidsmall_34);
        this.cuboid_7.addChild(this.cuboidsmall_22);
        this.cuboid_2.addChild(this.cuboid_3);
        this.cuboid_11.addChild(this.cuboidsmall_39);
        this.cuboid_11.addChild(this.cuboidsmall_41);
        this.top.addChild(this.topside);
        this.cuboid_13.addChild(this.cuboidsmall_45);
        this.cuboid_6.addChild(this.cuboidsmall_19);
        this.cuboid_10.addChild(this.cuboidsmall_35);
        this.cuboid_3.addChild(this.cuboidsmall_9);
        this.cuboid_3.addChild(this.cuboidsmall_13);
        this.cuboid_11.addChild(this.cuboidsmall_37);
        this.top.addChild(this.shape40_3);
        this.cuboid_5.addChild(this.cuboid_6);
        this.cuboid_9.addChild(this.cuboidsmall_29);
        this.cuboid_5.addChild(this.cuboidsmall_15);
        this.cuboid_3.addChild(this.cuboidsmall_10);
        this.cuboid_14.addChild(this.cuboidsmall_49);
        this.cuboid_14.addChild(this.cuboid_15);
        this.cuboid_6.addChild(this.cuboid_7);
        this.cuboid_3.addChild(this.cuboidsmall_12);
        this.cuboid_15.addChild(this.cuboidsmall_51);
        this.cuboid_2.addChild(this.cuboidsmall_4);
        this.cuboid_2.addChild(this.cuboidsmall_7);
        this.cuboid_13.addChild(this.cuboid_14);
        this.cuboid_15.addChild(this.cuboidsmall_55);
        this.cuboid_9.addChild(this.cuboidsmall_28);
        this.cuboid_15.addChild(this.cuboidsmall_54);
        this.cuboid_15.addChild(this.cuboidsmall_52);
        this.cuboid_14.addChild(this.cuboidsmall_46);
        this.cuboid_8.addChild(this.cuboid_9);
        this.cuboid_13.addChild(this.cuboidsmall_42);
        this.cuboid_5.addChild(this.cuboidsmall_16);
        this.cuboid_6.addChild(this.cuboidsmall_18);
        this.cuboid_10.addChild(this.cuboid_11);
        this.cuboid_7.addChild(this.cuboidsmall_27);
        this.cuboid_9.addChild(this.cuboidsmall_30);
        this.cuboid_5.addChild(this.cuboidsmall_17);
        this.cuboid_5.addChild(this.cuboidsmall_14);
        this.cuboid_15.addChild(this.cuboidsmall_53);
        this.top.addChild(this.shape42);
        this.top.addChild(this.shape40_1);
        this.cuboid_3.addChild(this.cuboidsmall_8);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.bottom.render(f5);
        this.cuboid_4.render(f5);
        this.cuboid_12.render(f5);
        this.BurnerBase.render(f5);
        this.cuboid.render(f5);
        this.top.render(f5);
        this.cuboid_8.render(f5);
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

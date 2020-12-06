package sample;

public class Property {
    String propertyLocation;
    String propertySqFt;
    String propertyPrice;
    String propertyParagraph;
    Boolean approved;
    Boolean discarded;

    String rd00;
    String rd01;
    String rd02;
    String rd03;
    String rd04;
    String rd05;
    String rd06;
    String rd07;
    String rd08;
    String rd09;

    String mp00;
    String mp01;
    String mp02;
    String mp03;
    String mp04;
    String mp05;
    String mp06;
    String mp07;
    String mp08;
    String mp09;

    String ed00;
    String ed01;
    String ed02;
    String ed03;
    String ed04;
    String ed05;
    String ed06;
    String ed07;
    String ed08;
    String ed09;

    Boolean cb0;
    Boolean cb1;
    Boolean cb2;
    Boolean cb3;
    Boolean cb4;
    Boolean cb5;
    Boolean cb6;
    Boolean cb7;
    Boolean cb8;
    Boolean cb9;


    Property(int page) {
        if (page == 0) {
            this.propertyLocation = "Madison, WI";
            this.propertySqFt = "1400";
            this.propertyPrice = "$155,000";
            this.propertyParagraph = "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST";

            this.rd00 = rd00 = "Roof";
            this.rd01 = "Shower tile";
            this.rd02 = "Garage door";
            this.rd03 = "Kitchen cabinets";
            this.rd04 = "Oven/Dish washer";
            this.rd05 = "Wall removal to open up kitchen";
            this.rd06 = "Pave driveway";
            this.rd07 = "Exterior paint";
            this.rd08 = "Interior paint";
            this.rd09 = "Windows";

            this.mp00 = "$7000";
            this.mp01 = "$2000";
            this.mp02 = "$700";
            this.mp03 = "$2000";
            this.mp04 = "$800";
            this.mp05 = "$3500";
            this.mp06 = "$5000";
            this.mp07 = "$750";
            this.mp08 = "$1100";
            this.mp09 = "$1500";

            this.ed00 = "25 hrs";
            this.ed01 = "10 hrs";
            this.ed02 = "2 hrs";
            this.ed03 = "6 hrs";
            this.ed04 = "1 hr";
            this.ed05 = "40 hrs";
            this.ed06 = "10 hrs";
            this.ed07 = "7 hrs";
            this.ed08 = "10 hrs";
            this.ed09 = "6 hrs";

            this.cb0 = false;
            this.cb1 = false;
            this.cb2 = false;
            this.cb3 = false;
            this.cb4 = false;
            this.cb5 = false;
            this.cb6 = false;
            this.cb7 = false;
            this.cb8 = false;
            this.cb9 = false;

        }
        if (page == 1) {
            this.propertyLocation = "Green Bay, WI";
            this.propertySqFt = "2200";
            this.propertyPrice = "$189,000";
            this.propertyParagraph = "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST";

            this.rd00 = "Carpet throughout (hardwood otherwise)";
            this.rd01 = "Paint shed";
            this.rd02 = "Mow overgrown lawn";
            this.rd03 = "Water heater";
            this.rd04 = "Bathroom vanity";
            this.rd05 = "Bathroom toilet";
            this.rd06 = "Bedroom closet doors";
            this.rd07 = "Patch wall holes";
            this.rd08 = "Foundation repair";
            this.rd09 = "Paint Exterior";

            this.mp00 = "3000";
            this.mp01 = "90";
            this.mp02 = "$250";
            this.mp03 = "$2000";
            this.mp04 = "$500";
            this.mp05 = "$500";
            this.mp06 = "$250";
            this.mp07 = "$100";
            this.mp08 = "$N/A";
            this.mp09 = "$800";

            this.ed00 = "9 hrs";
            this.ed01 = "1 hrs";
            this.ed02 = "2 hrs";
            this.ed03 = "2 hrs";
            this.ed04 = "4 hrs";
            this.ed05 = "40 hrs";
            this.ed06 = "2 hrs";
            this.ed07 = "2 hrs";
            this.ed08 = "N/A";
            this.ed09 = "6 hrs";

            this.cb0 = false;
            this.cb1 = false;
            this.cb2 = false;
            this.cb3 = false;
            this.cb4 = false;
            this.cb5 = false;
            this.cb6 = false;
            this.cb7 = false;
            this.cb8 = false;
            this.cb9 = false;
        }
        if (page == 2) {
            this.propertyLocation = "La Crosse, WI";
            this.propertySqFt = "950";
            this.propertyPrice = "$88,000";
            this.propertyParagraph = "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST";

            this.rd00 = "Carpet throughout (hardwood otherwise)";
            this.rd01 = "Paint shed";
            this.rd02 = "Mow overgrown lawn";
            this.rd03 = "Water heater";
            this.rd04 = "Bathroom vanity";
            this.rd05 = "Bathroom toilet";
            this.rd06 = "Bedroom closet doors";
            this.rd07 = "Windows";
            this.rd08 = "Interior paint";
            this.rd09 = "Exterior paint";

            this.mp00 = "3000";
            this.mp01 = "90";
            this.mp02 = "$250";
            this.mp03 = "$2000";
            this.mp04 = "$500";
            this.mp05 = "$500";
            this.mp06 = "$250";
            this.mp07 = "$1500";
            this.mp08 = "$1100";
            this.mp09 = "$750";

            this.ed00 = "9 hrs";
            this.ed01 = "1 hrs";
            this.ed02 = "2 hrs";
            this.ed03 = "2 hrs";
            this.ed04 = "4 hrs";
            this.ed05 = "40 hrs";
            this.ed06 = "2 hrs";
            this.ed07 = "6 hrs";
            this.ed08 = "10 hrs";
            this.ed09 = "7 hrs";

            this.cb0 = false;
            this.cb1 = false;
            this.cb2 = false;
            this.cb3 = false;
            this.cb4 = false;
            this.cb5 = false;
            this.cb6 = false;
            this.cb7 = false;
            this.cb8 = false;
            this.cb9 = false;
        }
        if (page == 3) {
            this.propertyLocation = "Milwaukee, WI";
            this.propertySqFt = "1900";
            this.propertyPrice = "$188,000";
            this.propertyParagraph = "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST";

            this.rd00 = "Carpet throughout (hardwood otherwise)";
            this.rd01 = "Paint shed";
            this.rd02 = "Mow overgrown lawn";
            this.rd03 = "Water heater";
            this.rd04 = "Bathroom vanity";
            this.rd05 = "Bathroom toilet";
            this.rd06 = "Bedroom closet doors";
            this.rd07 = "Windows";
            this.rd08 = "Interior paint";
            this.rd09 = "Exterior paint";

            this.mp00 = "3000";
            this.mp01 = "90";
            this.mp02 = "$250";
            this.mp03 = "$2000";
            this.mp04 = "$500";
            this.mp05 = "$500";
            this.mp06 = "$250";
            this.mp07 = "$1500";
            this.mp08 = "$1100";
            this.mp09 = "$750";

            this.ed00 = "9 hrs";
            this.ed01 = "1 hrs";
            this.ed02 = "2 hrs";
            this.ed03 = "2 hrs";
            this.ed04 = "4 hrs";
            this.ed05 = "40 hrs";
            this.ed06 = "2 hrs";
            this.ed07 = "6 hrs";
            this.ed08 = "10 hrs";
            this.ed09 = "7 hrs";

            this.cb0 = false;
            this.cb1 = false;
            this.cb2 = false;
            this.cb3 = false;
            this.cb4 = false;
            this.cb5 = false;
            this.cb6 = false;
            this.cb7 = false;
            this.cb8 = false;
            this.cb9 = false;
        }
        if (page == 4) {
            this.propertyLocation = "La Crosse, WI";
            this.propertySqFt = "950";
            this.propertyPrice = "$88,000";
            this.propertyParagraph = "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST" +
                    "TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST";

            this.rd00 = "Carpet throughout (hardwood otherwise)";
            this.rd01 = "Paint shed";
            this.rd02 = "Mow overgrown lawn";
            this.rd03 = "Water heater";
            this.rd04 = "Bathroom vanity";
            this.rd05 = "Bathroom toilet";
            this.rd06 = "Bedroom closet doors";
            this.rd07 = "Windows";
            this.rd08 = "Interior paint";
            this.rd09 = "Exterior paint";

            this.mp00 = "3000";
            this.mp01 = "90";
            this.mp02 = "$250";
            this.mp03 = "$2000";
            this.mp04 = "$500";
            this.mp05 = "$500";
            this.mp06 = "$250";
            this.mp07 = "$1500";
            this.mp08 = "$1100";
            this.mp09 = "$750";

            this.ed00 = "9 hrs";
            this.ed01 = "1 hrs";
            this.ed02 = "2 hrs";
            this.ed03 = "2 hrs";
            this.ed04 = "4 hrs";
            this.ed05 = "40 hrs";
            this.ed06 = "2 hrs";
            this.ed07 = "6 hrs";
            this.ed08 = "10 hrs";
            this.ed09 = "7 hrs";

            this.cb0 = false;
            this.cb1 = false;
            this.cb2 = false;
            this.cb3 = false;
            this.cb4 = false;
            this.cb5 = false;
            this.cb6 = false;
            this.cb7 = false;
            this.cb8 = false;
            this.cb9 = false;
        }
    }
}

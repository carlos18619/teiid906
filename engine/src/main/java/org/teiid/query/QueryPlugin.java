/*
 * JBoss, Home of Professional Open Source.
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */

package org.teiid.query;

import java.util.ResourceBundle;

import org.teiid.core.BundleUtil;

/**
 * QueryPlugin
 * <p>
 * Used here in <code>query</code> to have access to the new logging framework for <code>LogManager</code>.
 * </p>
 */
public class QueryPlugin { // extends Plugin {

	/**
	 * The plug-in identifier of this plugin 
	 */
	public static final String PLUGIN_ID = QueryPlugin.class.getPackage().getName();

	public static final BundleUtil Util = new BundleUtil(PLUGIN_ID,
	                                                     PLUGIN_ID + ".i18n", ResourceBundle.getBundle(PLUGIN_ID + ".i18n")); //$NON-NLS-1$ //$NON-NLS-2$
	
	
	public static enum Event implements BundleUtil.Event{
		TEIID30001, // buffer manager max block exceeded
		TEIID30002, // error persisting buffer manager
		TEIID30003, // capability required
		TEIID30004, // zero size batch
		TEIID30005, // rollback failed
		TEIID30006, // invalid max active plans
		TEIID30008, // request not deterministic
		TEIID30009, // max threads exceeded
		TEIID30011, // dependent criteria over max
		TEIID30012, // mat row refresh
		TEIID30013, // mat table loading
		TEIID30014, // mat table loaded
		TEIID30015, //faild to load mat table
		TEIID30016, // error transfer
		TEIID30017, // error persisting batch in bm
		TEIID30018, 
		TEIID30019, // process worker error
		TEIID30020, // process worker error
		TEIID30021, // uncaught exception during work
		TEIID30022, // error defrag
		TEIID30023, // error defrag truncate
		TEIID30024, // cancel request failed
		TEIID30025, // failed to restore results
		TEIID30026, // failed to cancel
		TEIID30027, // lob error
		TEIID30028, // failed to rollback
		TEIID30029, // unexpected format
		TEIID30030, // unexpected exp1
		TEIID30031, // unexpected exp2
		TEIID30032,
		TEIID30033,
		TEIID30034,
		TEIID30035,
		TEIID30036,
		TEIID30037,
		TEIID30038,
		TEIID30039,
		TEIID30040,
		TEIID30041,
		TEIID30042,
		TEIID30043,
		TEIID30044,
		TEIID30045,
		TEIID30046,
		TEIID30048,
		TEIID30049,
		TEIID30050,
		TEIID30051,
		TEIID30052,
		TEIID30053,
		TEIID30054,
		TEIID30055,
		TEIID30056,
		TEIID30057,
		TEIID30058,
		TEIID30059,
		TEIID30060,
		TEIID30061,
		TEIID30063,
		TEIID30064,
		TEIID30065,
		TEIID30066,
		TEIID30067,
		TEIID30068,
		TEIID30069,
		TEIID30070,
		TEIID30071,
		TEIID30072,
		TEIID30074,
		TEIID30075,
		TEIID30077,
		TEIID30079,
		TEIID30082,
		TEIID30083,
		TEIID30084,
		TEIID30085,
		TEIID30086,
		TEIID30087,
		TEIID30088,
		TEIID30089,
		TEIID30090,
		TEIID30091,
		TEIID30093,
		TEIID30094,
		TEIID30095,
		TEIID30096,
		TEIID30097,
		TEIID30098,
		TEIID30099,
		TEIID30100,
		TEIID30101,
		TEIID30102,
		TEIID30103,
		TEIID30112,
		TEIID30114,
		TEIID30115,
		TEIID30116,
		TEIID30117,
		TEIID30118,
		TEIID30121,
		TEIID30123,
		TEIID30124,
		TEIID30125,
		TEIID30126,
		TEIID30127,
		TEIID30128,
		TEIID30129,
		TEIID30130,
		TEIID30131,
		TEIID30133,
		TEIID30134,
		TEIID30135,
		TEIID30136,
		TEIID30137,
		TEIID30138,
		TEIID30139,
		TEIID30140,
		TEIID30141,
		TEIID30143,
		TEIID30144,
		TEIID30145,
		TEIID30146,
		TEIID30147,
		TEIID30148,
		TEIID30151,
		TEIID30152,
		TEIID30153,
		TEIID30154,
		TEIID30155,
		TEIID30156,
		TEIID30158,
		TEIID30159,
		TEIID30160,
		TEIID30161,
		TEIID30162,
		TEIID30163,
		TEIID30164,
		TEIID30165,
		TEIID30166,
		TEIID30167,
		TEIID30168,
		TEIID30169,
		TEIID30170,
		TEIID30171,
		TEIID30172,
		TEIID30174,
		TEIID30175,
		TEIID30176,
		TEIID30178,
		TEIID30179,
		TEIID30180,
		TEIID30181,
		TEIID30182,
		TEIID30183,
		TEIID30184,
		TEIID30187,
		TEIID30188,
		TEIID30190,
		TEIID30192,
		TEIID30193,
		TEIID30194,
		TEIID30195,
		TEIID30196,
		TEIID30197,
		TEIID30198,
		TEIID30199,
		TEIID30200,
		TEIID30201,
		TEIID30202,
		TEIID30203,
		TEIID30204,
		TEIID30205,
		TEIID30206,
		TEIID30207,
		TEIID30208,
		TEIID30209,
		TEIID30210,
		TEIID30211,
		TEIID30212,
		TEIID30213,
		TEIID30216,
		TEIID30217,
		TEIID30218,
		TEIID30219,
		TEIID30220,
		TEIID30221,
		TEIID30222,
		TEIID30223,
		TEIID30224,
		TEIID30225,
		TEIID30226,
		TEIID30227,
		TEIID30229,
		TEIID30230,
		TEIID30231,
		TEIID30232,
		TEIID30233,
		TEIID30234,
		TEIID30235,
		TEIID30236,
		TEIID30238,
		TEIID30239,
		TEIID30240,
		TEIID30241,
		TEIID30242,
		TEIID30244,
		TEIID30245,
		TEIID30247,
		TEIID30248,
		TEIID30249,
		TEIID30250,
		TEIID30251,
		TEIID30253,
		TEIID30254,
		TEIID30257,
		TEIID30258,
		TEIID30259,
		TEIID30263,
		TEIID30264,
		TEIID30265,
		TEIID30266,
		TEIID30267,
		TEIID30268,
		TEIID30269,
		TEIID30270,
		TEIID30271,
		TEIID30272,
		TEIID30273,
		TEIID30274,
		TEIID30275,
		TEIID30278,
		TEIID30281,
		TEIID30283,
		TEIID30284,
		TEIID30285,
		TEIID30286,
		TEIID30287,
		TEIID30288,
		TEIID30294,
		TEIID30295,
		TEIID30296,
		TEIID30297,
		TEIID30300,
		TEIID30301,
		TEIID30302,
		TEIID30303,
		TEIID30304,
		TEIID30305,
		TEIID30306,
		TEIID30307,
		TEIID30308,
		TEIID30309,
		TEIID30311,
		TEIID30312,
		TEIID30314,
		TEIID30316,
		TEIID30323,
		TEIID30324,
		TEIID30326,
		TEIID30328,
		TEIID30329,
		TEIID30331,
		TEIID30333,
		TEIID30334,
		TEIID30335,
		TEIID30336,
		TEIID30338,
		TEIID30341,
		TEIID30342,
		TEIID30345,
		TEIID30347,
		TEIID30350,
		TEIID30351,
		TEIID30352,
		TEIID30353,
		TEIID30354,
		TEIID30355,
		TEIID30356,
		TEIID30357,
		TEIID30358,
		TEIID30359,
		TEIID30363,
		TEIID30364,
		TEIID30365,
		TEIID30366,
		TEIID30371,
		TEIID30372,
		TEIID30373,
		TEIID30375,
		TEIID30376,
		TEIID30377,
		TEIID30378,
		TEIID30381,
		TEIID30382,
		TEIID30384,
		TEIID30385,
		TEIID30386,
		TEIID30387,
		TEIID30388,
		TEIID30389,
		TEIID30390,
		TEIID30391,
		TEIID30392,
		TEIID30396,
		TEIID30398,
		TEIID30399,
		TEIID30400,
		TEIID30401,
		TEIID30402,
		TEIID30403,
		TEIID30404,
		TEIID30405,
		TEIID30406,
		TEIID30407,
		TEIID30409,
		TEIID30410,
		TEIID30411,
		TEIID30412,
		TEIID30413,
		TEIID30416,
		TEIID30418,
		TEIID30419,
		TEIID30420,
		TEIID30421,
		TEIID30422,
		TEIID30423,
		TEIID30424,
		TEIID30427,
		TEIID30428,
		TEIID30429,
		TEIID30430,
		TEIID30431,
		TEIID30432,
		TEIID30434,
		TEIID30437,
		TEIID30438,
		TEIID30439,
		TEIID30440,
		TEIID30441,
		TEIID30442,
		TEIID30443,
		TEIID30444,
		TEIID30445,
		TEIID30447,
		TEIID30448,
		TEIID30449,
		TEIID30452,
		TEIID30457,
		TEIID30463,
		TEIID30464,
		TEIID30465,
		TEIID30466,
		TEIID30467,
		TEIID30468,
		TEIID30469,
		TEIID30470,
		TEIID30471,
		TEIID30472,
		TEIID30473,
		TEIID30474,
		TEIID30475,
		TEIID30476,
		TEIID30477,
		TEIID30478,
		TEIID30479,
		TEIID30481,
		TEIID30482,
		TEIID30483,
		TEIID30484,
		TEIID30485,
		TEIID30486,
		TEIID30487,
		TEIID30488,
		TEIID30489,
		TEIID30490,
		TEIID30491,
		TEIID30492,
		TEIID30493,
		TEIID30495,
		TEIID30496,
		TEIID30497,
		TEIID30498,
		TEIID30499,
		TEIID30500,
		TEIID30503,
		TEIID30504,
		TEIID30505,
		TEIID30506,
		TEIID30507,
		TEIID30508,
		TEIID30509,
		TEIID30510,
		TEIID30512,
		TEIID30517,
		TEIID30518,
		TEIID30519,
		TEIID30520,
		TEIID30521,
		TEIID30522,
		TEIID30524,
		TEIID30525,
		TEIID30526,
		TEIID30527,
		TEIID30528,
		TEIID30530,
		TEIID30535,
		TEIID30537,
		TEIID30538,
		TEIID30541,
		TEIID30542,
		TEIID30543,
		TEIID30544,
		TEIID30545,
		TEIID30546,
		TEIID30548,
		TEIID30549,
		TEIID30550,
		TEIID30551,
		TEIID30552,
		TEIID30553,
		TEIID30554,
		TEIID30555,
		TEIID30556,
		TEIID30557,
		TEIID30558,
		TEIID30559,
		TEIID30561,
		TEIID30562,
		TEIID30563,
		TEIID30564,
		TEIID30565,
		TEIID30580,
		TEIID30590,
		TEIID30591,
		TEIID30600, 
		TEIID30601, 
		TEIID30602, //User defined aggregate errors
    	TEIID31069,
    	TEIID31070,
    	TEIID31071,
    	TEIID31072,
    	TEIID31073,
    	TEIID31075,
    	TEIID31077,
    	TEIID31078,
    	TEIID31079,
    	TEIID31080,
    	TEIID31081,
    	TEIID31082,
    	TEIID31083,
    	TEIID31084,
    	TEIID31085,
    	TEIID31086,
    	TEIID31087,
    	TEIID31088,
    	TEIID31089,
    	TEIID31090,
    	TEIID31091,
    	TEIID31092,
    	TEIID31093,
    	TEIID31094,
    	TEIID31095,
    	TEIID31096,
    	TEIID31097,
    	TEIID31098, //alter imported
    	TEIID31099, //vdb loading
    	TEIID31100, //parse exception
    	TEIID31101, 
    	TEIID31102, 
    	TEIID31103, 
    	TEIID31104, //recursion limit hit
    	TEIID31105, //warning
    	TEIID31106, //duplicate param name
    	TEIID31107, //too many result params
    	TEIID31108, //datasource not available
    	TEIID31109, //invalid scripting language
    	TEIID31110, //invalid script
    	TEIID31111, //invalid teiid script
    	TEIID31112, //invalid vararg
    	TEIID31113,
    	TEIID31114,
    	TEIID31115,
    	TEIID31116,
    	TEIID31117,
    	TEIID31118,
    	TEIID31119, 
    	TEIID31120, 
    	TEIID31121, 
    	TEIID31122, 
    	TEIID31123, 
    	TEIID31124, 
    	TEIID31125, 
    	TEIID31126,
    	TEIID31127, 
    	TEIID31128, 
    	TEIID31129, 
    	TEIID31130, 
    	TEIID31131, 
    	TEIID31132, 
    	TEIID31133, 
    	TEIID31134,
    	TEIID31135, 
    	TEIID31136, 
    	TEIID31137, 
    	TEIID31138,
    	TEIID31139, 
    	TEIID31140,
    	TEIID31141, 
    	TEIID31142, 
    	TEIID31143, 
    	TEIID31144,
    	TEIID31145,
    	TEIID31146,
    	TEIID31147, 
    	TEIID31148, 
    	TEIID31149, 
    	TEIID31150,
    	TEIID31151, 
    	TEIID31152, 
    	TEIID31153, 
    	TEIID31154,
    	TEIID31155, 
    	TEIID31156, 
    	TEIID31157, 
    	TEIID31158, 
    	TEIID31159, 
    	TEIID31160, 
    	TEIID31161,
    	TEIID31162, // Missing proj4 text.
    	TEIID31163, // Failed to lookup proj4 text.
    	TEIID31164, // Unsupported geometry type.
    	TEIID31165, 
    	TEIID31166,
    	TEIID31167,
    	TEIID31168, // Unsupported regex flag.
    	TEIID31169,  // out of range
    	TEIID31170, 
    	TEIID31171, 
    	TEIID31172,
    	TEIID31173, 
    	TEIID31174, 
    	TEIID31175, 
    	TEIID31176, 
    	TEIID31177, 
    	TEIID31178, 
    	TEIID31179, 
    	TEIID31190, 
    	TEIID31191,
    	TEIID31192,
    	TEIID31193,
    	TEIID31194,
    	TEIID31195, 
    	TEIID31196, 
    	TEIID31197,
    	TEIID31198,
    	TEIID31199, 
    	TEIID31200, 
    	TEIID31201, 
    	TEIID31202, 
    	TEIID31203,
    	TEIID31204,
    	TEIID31205, 
    	TEIID31206, 
    	TEIID31207, 
    	TEIID31208,
	}
}

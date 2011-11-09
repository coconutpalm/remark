/*
 * Copyright 2011 OverZealous Creations, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.overzealous.remark.convert;

import com.overzealous.remark.Options;
import com.overzealous.remark.Remark;
import org.junit.Test;

/**
 * @author Phil DeJarnett
 */
public class AnchorSimpleIdTest extends RemarkTester {

	@Override
	public Remark setupRemark() {
		Options opts = Options.markdown();
		opts.simpleLinkIds = true;
		return new Remark(opts);
	}

	@Test public void testAnchors()			throws Exception { test("anchor", "simpleids"); }
	
}

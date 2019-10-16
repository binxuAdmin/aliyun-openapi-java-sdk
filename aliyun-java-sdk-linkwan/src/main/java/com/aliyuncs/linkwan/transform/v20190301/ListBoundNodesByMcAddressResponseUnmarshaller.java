/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListBoundNodesByMcAddressResponse;
import com.aliyuncs.linkwan.model.v20190301.ListBoundNodesByMcAddressResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBoundNodesByMcAddressResponseUnmarshaller {

	public static ListBoundNodesByMcAddressResponse unmarshall(ListBoundNodesByMcAddressResponse listBoundNodesByMcAddressResponse, UnmarshallerContext _ctx) {
		
		listBoundNodesByMcAddressResponse.setRequestId(_ctx.stringValue("ListBoundNodesByMcAddressResponse.RequestId"));
		listBoundNodesByMcAddressResponse.setSuccess(_ctx.booleanValue("ListBoundNodesByMcAddressResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListBoundNodesByMcAddressResponse.Data.TotalCount"));

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListBoundNodesByMcAddressResponse.Data.List.Length"); i++) {
			list.add(_ctx.stringValue("ListBoundNodesByMcAddressResponse.Data.List["+ i +"]"));
		}
		data.setList(list);
		listBoundNodesByMcAddressResponse.setData(data);
	 
	 	return listBoundNodesByMcAddressResponse;
	}
}
<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_(document).ready(function ()           _62efb9</name>
   <tag></tag>
   <elementGuidId>3d0d2f5f-f613-4182-ad63-f9246af99d9d</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#DivServicesForInvDiagSectionDDL > div.col-md-9</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='DivServicesForInvDiagSectionDDL']/div[2]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>2ae6715d-d8f3-471e-b198-b8e14bc59a98</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>col-md-9</value>
      <webElementGuid>adb8e924-4063-41b9-9387-9de409f8e609</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-select2-id</name>
      <type>Main</type>
      <value>408</value>
      <webElementGuid>52a17050-c898-4b5c-bcf4-c8dfca0f28f4</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                            
                            

                            $(document).ready(function () {

                                $('#DepartmentId option').each(function (Index, Element) {
                                    var attributes = $(Element).text().split(';');
                                    $(Element).attr('Charges', attributes[1])
                                    $(Element).attr('IsInPatient', attributes[2])
                                    $(Element).attr('ConsultancyServiceId', attributes[3])
                                    $(Element).text(attributes[0])

                                    $('#DepartmentId').selectpicker('refresh');

                                });

                                window.SubServicesTotal = 0;
                                window.MiscSubServicesTotal = 0;
                                //window.SumOFExcludedAmount = 0;
                                window.SubserviceDetailList = [];
                                window.IsdynamicCreated = false;
                                window.ServiceIds = []
                                $('#SubServicesId').on('change', function () {
                                    window.SubserviceDetailList=[]
                                    if ($(&quot;#PackageGroupId&quot;).val() != &quot;&quot; &amp;&amp; window.PackageGroupServicesData &amp;&amp; window.PackageGroupServicesData.length > 0) {
                                        $('.Pocket').empty();
                                        $('#Total').val('').trigger('change');

                                        $('#PatientCheckInForm').bootstrapValidator('enableFieldValidators', 'SubServicesId', false);
                                        $('#SubServicesId option:selected').each(function (Index, Element) {
                                            if (window.PackageGroupServicesData &amp;&amp; window.PackageGroupServicesData.length > 0) {
                                                var selectedresult = window.PackageGroupServicesData.find(obj => {
                                                    return obj.Id === $(Element).val()
                                                });
                                                if (selectedresult &amp;&amp; selectedresult.Id) {
                                                    return false;
                                                }
                                            }
                                            var charges = 0;
                                            var selecteddata = $('#SubServicesId').select2('data')[Index];
                                            if (selecteddata &amp;&amp; selecteddata.Name) {
                                                charges = selecteddata.Name.split(';')[1];
                                            }

                                            AddDynamicFields(1, $(Element).val(), charges, $(Element).text(), false, selecteddata.ChargeTypeName, selecteddata.ChargeIntervalName, selecteddata.IntervalDuration, selecteddata.Name.split(';')[2], selecteddata.DeliveryDateTime);

                                            window.SubserviceDetailList.push({
                                                SubServiceId: $(Element).val(), Charges: charges, TypeBit: selecteddata.Name.split(';')[2],
                                                DiscountType: null, DiscountRate: null, TotalCharges: charges, PaidAmount: 0, IsUrgent: 0, ExecutionDateTime: null, UrgentDateTime: null, GovernmentCharges: selecteddata.GovernmentCharges
                                            })
                                            window.SubServicesTotal = parseInt(window.SubServicesTotal) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;);
                                            $('#Total').val(parseInt(Utilities.IsNotUndefinedOrNull($('#Total').val()) ? $('#Total').val() : &quot;0&quot;) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;)).trigger('change')
                                             
                                            //window.SumOFExcludedAmount = parseInt(window.SumOFExcludedAmount == undefined || window.SumOFExcludedAmount == null ? 0 : window.SumOFExcludedAmount) + parseInt(Utilities.IsNotUndefinedOrNull(selecteddata.GovernmentCharges) ? selecteddata.GovernmentCharges : &quot;0&quot;);
                                        });

                                        if (window.PackageGroupServicesData &amp;&amp; window.PackageGroupServicesData.length > 0) {

                                            DiscountData = window.PackageGroupServicesData[0];
                                            $('#PatientCheckInForm').bootstrapValidator('enableFieldValidators', 'SubServicesId', false);

                                            $(window.PackageGroupServicesData).each(function (Index, Element) {
                                                var servicename = &quot;&quot;;
                                                var serviceDetail = Element.Name.split(';');
                                                if (serviceDetail[0]) {
                                                    servicename = serviceDetail[0].split('--')[1]
                                                }
                                                AddDynamicFields(1, Element.Id, serviceDetail[1], servicename, false, Element.ChargeTypeName, Element.ChargeIntervalName, Element.IntervalDuration, serviceDetail[2], Element.DeliveryDateTime); // Creating field for selected options 1= &quot;added field in
                                                window.SubserviceDetailList.push({
                                                    SubServiceId: Element.Id, Charges: serviceDetail[1], TypeBit: serviceDetail[2],
                                                    DiscountType: null, DiscountRate: null, TotalCharges: serviceDetail[1], PaidAmount: 0, IsUrgent: 0, ExecutionDateTime: null, UrgentDateTime: null, GovernmentCharges: Element.GovernmentCharges
                                                })
                                                window.SubServicesTotal = parseInt(window.SubServicesTotal) + parseInt(Utilities.IsNotUndefinedOrNull(serviceDetail[1]) ? serviceDetail[1] : &quot;0&quot;);
                                                $('#Total').val(parseInt(Utilities.IsNotUndefinedOrNull($('#Total').val()) ? $('#Total').val() : &quot;0&quot;) + parseInt(Utilities.IsNotUndefinedOrNull(serviceDetail[1]) ? serviceDetail[1] : &quot;0&quot;)).trigger('change')
                                                
                                                //window.SumOFExcludedAmount = parseInt(window.SumOFExcludedAmount == undefined || window.SumOFExcludedAmount == null ? 0 : window.SumOFExcludedAmount) + parseInt(Utilities.IsNotUndefinedOrNull(Element.GovernmentCharges) ? Element.GovernmentCharges : &quot;0&quot;);
                                            })
                                            $('#TemplateLabelFields').show();
                                            $('.TemplateParent').show();

                                            if (DiscountData &amp;&amp; DiscountData.PackageGroupDiscountRate &amp;&amp; parseFloat(DiscountData.PackageGroupDiscountRate) > 0) {
                                                $(&quot;#LDyes&quot;).prop('checked', true);
                                                $('#LDyes').change();
                                                if (DiscountData.PackageGroupDiscountType == 1) {
                                                    $(&quot;#LDAm&quot;).prop('checked', true);

                                                }
                                                $(&quot;#LDDiscount&quot;).val(DiscountData.PackageGroupDiscountRate);
                                                $(&quot;#LDDiscount&quot;).keyup();
                                            }
                                        }

                                        return false;
                                    }

                                    window.SubServicesTotal = 0;
                                    //window.SumOFExcludedAmount = 0;
                                    //if (window.PackageChanged) {
                                    //    window.SubServicesTotal = parseInt($('#IndividualPackageId').find('option:selected').attr('Charges'))
                                    //}
                                    window.MiscSubServicesTotal = 0;
                                    window.serviceDetailList = [];
                                    window.SubserviceDetailList = [];
                                    if ($('input[name=CheckInTypeId][id=Services]').is(':checked'))
                                    {
                                        window.ServiceIds = [];
                                    }
                                    
                                    if ($('#SubServicesId').find('option:selected').val() != &quot;&quot; &amp;&amp; $('#SubServicesId').find('option:selected').val() != null) {
                                        //if (!window.PackageChanged)
                                        //{
                                        $('.Pocket').empty();
                                        //}

                                        if (Utilities.IsNotUndefinedOrNull($('#IndividualPackageId')) &amp;&amp; $('#IndividualPackageId').val() != '') {
                                            AddDynamicFields(1, $('#IndividualPackageId').find('option:selected').val(), $('#IndividualPackageId').find('option:selected').attr('Charges'), $('#IndividualPackageId').find('option:selected').text(), false, $('#IndividualPackageId').find('option:selected').attr('ChargeTypeName'), $('#IndividualPackageId').find('option:selected').attr('ChargeIntervalName'), $('#IndividualPackageId').find('option:selected').attr('IntervalDuration')); // Creating field for selected options 1= &quot;added field in
                                            $('#Total').val($('#IndividualPackageId').find('option:selected').attr('Charges')).trigger('change')
                                            window.SubServicesTotal = parseInt($('#IndividualPackageId').find('option:selected').attr('Charges'))
                                        }
                                        //if ($('#SubServicesId').find('option:selected').text() == 'Emergency' || $('#SubServicesId').find('option:selected').text() == 'Consultation') {
                                        //    window.IsdynamicCreated = true;

                                        //    AddDynamicFields(1, $('#SubServicesId').find('option:selected').val(), $('#SubServicesId').find('option:selected').attr('Charges'), $('#SubServicesId').find('option:selected').text(), false, $('#SubServicesId').find('option:selected').attr('ChargeTypeName'), $('#SubServicesId').find('option:selected').attr('ChargeIntervalName'), $('#SubServicesId').find('option:selected').attr('IntervalDuration')); // Creating field for selected options 1= &quot;added field in
                                        //    window.ServiceIds[1] = $('#SubServicesId').find('option:selected').val();
                                        //    CreateEventfordynamicfield();  // Creating event for dynamic fields Dynamcic fields
                                        //    AddValidations();

                                        //    $('#Total').val(parseInt(Utilities.IsNotUndefinedOrNull($('#SubServicesId').find('option:selected').attr('Charges')) ? $('#SubServicesId').find('option:selected').attr('Charges') : &quot;0&quot;))
                                        //}
                                        //else {
                                            var i = 0;
                                        $('#SubServicesId option:selected').each(function (Index, Element) {

                                            var selecteddata = $('#SubServicesId').select2('data')[Index];
                                            var charges = 0;
                                                i = i + 1;
                                            if (selecteddata &amp;&amp; selecteddata.Name) {
                                                charges = selecteddata.Name.split(';')[1];
                                            }

                                            $(&quot;#divSrno&quot;).show();
                                            $(&quot;#divCode&quot;).show();
                                            $(&quot;#divUrgent&quot;).show();
                                            $(&quot;#divTUrgent&quot;).show();
                                            $(&quot;#divTSrno&quot;).show();
                                            $(&quot;#divTCode&quot;).show();
                                            $(&quot;#DivService&quot;).removeClass('offset-3');
                                            $(&quot;#DivTService&quot;).removeClass('offset-3');
                                                AddDynamicFields(1, $(Element).val(), charges, selecteddata.SubServices, false, selecteddata.ChargeTypeName, selecteddata.ChargeIntervalName, selecteddata.IntervalDuration, selecteddata.Name.split(';')[2], selecteddata.DeliveryDateTime, selecteddata.Code, i, selecteddata.UrgentDateTime); // Creating field for selected options 1= &quot;added field in
                                            window.SubserviceDetailList.push({
                                                SubServiceId: $(Element).val(), Charges: charges, TypeBit: selecteddata.Name.split(';')[2],
                                                    DiscountType: null, DiscountRate: null, TotalCharges: charges, PaidAmount: 0, IsUrgent: 0,
                                                    ExecutionDateTime: moment(selecteddata.DeliveryDateTime), UrgentDateTime: null, GovernmentCharges: selecteddata.GovernmentCharges

                                            })

                                            window.SubServicesTotal = parseInt(window.SubServicesTotal) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;);
                                             
                                            //window.SumOFExcludedAmount = parseInt(window.SumOFExcludedAmount == undefined || window.SumOFExcludedAmount == null ? 0 : window.SumOFExcludedAmount) + parseInt(Utilities.IsNotUndefinedOrNull(selecteddata.GovernmentCharges) ? selecteddata.GovernmentCharges : 0);


                                            $('#Total').val(parseInt(Utilities.IsNotUndefinedOrNull($('#Total').val()) ? $('#Total').val() : &quot;0&quot;) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;)).trigger('change')



                                        })
                                        $('#Total').val(parseInt(window.SubServicesTotal) - parseInt(window.MiscSubServicesTotal)).trigger('change')
                                        //}
                                    }
                                    else {
                                        if ($('#SubServicesId').find('option:selected').text() == 'Emergency' || $('#SubServicesId').find('option:selected').text() == 'Consultation') {
                                            window.IsdynamicCreated = false;
                                            $('.Pocket').empty();
                                            $('#Total').val(parseInt(Utilities.IsNotUndefinedOrNull($('#Total').val()) ? $('#Total').val() : &quot;0&quot;) - parseInt(Utilities.IsNotUndefinedOrNull($('#SubServicesId').find('option:selected').attr('Charges')) ? $('#SubServicesId').find('option:selected').attr('Charges') : &quot;0&quot;)).trigger('change')
                                            RemoveValidation();
                                            $('#TemplateLabelFields').addClass('hide');
                                            window.ServiceIds = []
                                        }
                                        else if ($('input[name=CheckInTypeId][id=Services]').is(':checked')) {
                                            debugger
                                            if (window.SubserviceDetailList != null &amp;&amp; window.SubserviceDetailList != &quot;&quot;) {
                                                window.SubserviceDetailList = window.SubserviceDetailList.filter(function (x) { return x.SubServiceId !== $('#SubServicesId').find('option:selected').val(); });
                                            }

                                            window.SubServicesTotal = window.SubServicesTotal - parseInt(Utilities.IsNotUndefinedOrNull($('#SubServicesId').find('option:selected').attr('Charges')) ? $('#SubServicesId').find('option:selected').attr('Charges') : &quot;0&quot;);

                                            $('#Total').val(parseInt(Utilities.IsNotUndefinedOrNull($('#Total').val()) ? $('#Total').val() : &quot;0&quot;) - parseInt(Utilities.IsNotUndefinedOrNull($('#SubServicesId').find('option:selected').attr('Charges')) ? $('#SubServicesId').find('option:selected').attr('Charges') : &quot;0&quot;)).trigger('change')

                                            $('#Total').val(parseInt(window.SubServicesTotal) - parseInt(window.MiscSubServicesTotal)).trigger('change')
                                        }

                                    }
                                    // $('#SubServicesId').selectpicker('refresh');

                                    if ($(&quot;#LDyes&quot;).prop('checked') == true)
                                    {
                                        $(&quot;#LDDiscount&quot;).keyup();
                                    }
                                })


                            })
                            
                        Please Select a Services</value>
      <webElementGuid>7d00add7-c646-4f7b-ae48-8cba7803f250</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;DivServicesForInvDiagSectionDDL&quot;)/div[@class=&quot;col-md-9&quot;]</value>
      <webElementGuid>dbaa4c91-0120-44a7-b0ff-2730940a11df</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='DivServicesForInvDiagSectionDDL']/div[2]</value>
      <webElementGuid>bc3b6fca-1f57-42b8-a78e-5762158af796</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='*'])[42]/following::div[1]</value>
      <webElementGuid>096cf438-48f2-4b5c-a797-b57acff52fcc</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Services'])[4]/following::div[1]</value>
      <webElementGuid>529fee77-9d4e-446d-be4d-8c7f211afbaf</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Miscellaneous-Services'])[1]/preceding::div[1]</value>
      <webElementGuid>c7c6b88c-0d24-40c2-81bc-3b2cf8a76fd3</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[10]/div[7]/div[2]</value>
      <webElementGuid>d2b32f76-6bdd-4b10-9f3d-f4bade1a1871</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[(text() = concat(&quot;
                            
                            

                            $(document).ready(function () {

                                $(&quot; , &quot;'&quot; , &quot;#DepartmentId option&quot; , &quot;'&quot; , &quot;).each(function (Index, Element) {
                                    var attributes = $(Element).text().split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;);
                                    $(Element).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;, attributes[1])
                                    $(Element).attr(&quot; , &quot;'&quot; , &quot;IsInPatient&quot; , &quot;'&quot; , &quot;, attributes[2])
                                    $(Element).attr(&quot; , &quot;'&quot; , &quot;ConsultancyServiceId&quot; , &quot;'&quot; , &quot;, attributes[3])
                                    $(Element).text(attributes[0])

                                    $(&quot; , &quot;'&quot; , &quot;#DepartmentId&quot; , &quot;'&quot; , &quot;).selectpicker(&quot; , &quot;'&quot; , &quot;refresh&quot; , &quot;'&quot; , &quot;);

                                });

                                window.SubServicesTotal = 0;
                                window.MiscSubServicesTotal = 0;
                                //window.SumOFExcludedAmount = 0;
                                window.SubserviceDetailList = [];
                                window.IsdynamicCreated = false;
                                window.ServiceIds = []
                                $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;, function () {
                                    window.SubserviceDetailList=[]
                                    if ($(&quot;#PackageGroupId&quot;).val() != &quot;&quot; &amp;&amp; window.PackageGroupServicesData &amp;&amp; window.PackageGroupServicesData.length > 0) {
                                        $(&quot; , &quot;'&quot; , &quot;.Pocket&quot; , &quot;'&quot; , &quot;).empty();
                                        $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;);

                                        $(&quot; , &quot;'&quot; , &quot;#PatientCheckInForm&quot; , &quot;'&quot; , &quot;).bootstrapValidator(&quot; , &quot;'&quot; , &quot;enableFieldValidators&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;SubServicesId&quot; , &quot;'&quot; , &quot;, false);
                                        $(&quot; , &quot;'&quot; , &quot;#SubServicesId option:selected&quot; , &quot;'&quot; , &quot;).each(function (Index, Element) {
                                            if (window.PackageGroupServicesData &amp;&amp; window.PackageGroupServicesData.length > 0) {
                                                var selectedresult = window.PackageGroupServicesData.find(obj => {
                                                    return obj.Id === $(Element).val()
                                                });
                                                if (selectedresult &amp;&amp; selectedresult.Id) {
                                                    return false;
                                                }
                                            }
                                            var charges = 0;
                                            var selecteddata = $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).select2(&quot; , &quot;'&quot; , &quot;data&quot; , &quot;'&quot; , &quot;)[Index];
                                            if (selecteddata &amp;&amp; selecteddata.Name) {
                                                charges = selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[1];
                                            }

                                            AddDynamicFields(1, $(Element).val(), charges, $(Element).text(), false, selecteddata.ChargeTypeName, selecteddata.ChargeIntervalName, selecteddata.IntervalDuration, selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[2], selecteddata.DeliveryDateTime);

                                            window.SubserviceDetailList.push({
                                                SubServiceId: $(Element).val(), Charges: charges, TypeBit: selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[2],
                                                DiscountType: null, DiscountRate: null, TotalCharges: charges, PaidAmount: 0, IsUrgent: 0, ExecutionDateTime: null, UrgentDateTime: null, GovernmentCharges: selecteddata.GovernmentCharges
                                            })
                                            window.SubServicesTotal = parseInt(window.SubServicesTotal) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;);
                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val()) ? $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val() : &quot;0&quot;) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                             
                                            //window.SumOFExcludedAmount = parseInt(window.SumOFExcludedAmount == undefined || window.SumOFExcludedAmount == null ? 0 : window.SumOFExcludedAmount) + parseInt(Utilities.IsNotUndefinedOrNull(selecteddata.GovernmentCharges) ? selecteddata.GovernmentCharges : &quot;0&quot;);
                                        });

                                        if (window.PackageGroupServicesData &amp;&amp; window.PackageGroupServicesData.length > 0) {

                                            DiscountData = window.PackageGroupServicesData[0];
                                            $(&quot; , &quot;'&quot; , &quot;#PatientCheckInForm&quot; , &quot;'&quot; , &quot;).bootstrapValidator(&quot; , &quot;'&quot; , &quot;enableFieldValidators&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;SubServicesId&quot; , &quot;'&quot; , &quot;, false);

                                            $(window.PackageGroupServicesData).each(function (Index, Element) {
                                                var servicename = &quot;&quot;;
                                                var serviceDetail = Element.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;);
                                                if (serviceDetail[0]) {
                                                    servicename = serviceDetail[0].split(&quot; , &quot;'&quot; , &quot;--&quot; , &quot;'&quot; , &quot;)[1]
                                                }
                                                AddDynamicFields(1, Element.Id, serviceDetail[1], servicename, false, Element.ChargeTypeName, Element.ChargeIntervalName, Element.IntervalDuration, serviceDetail[2], Element.DeliveryDateTime); // Creating field for selected options 1= &quot;added field in
                                                window.SubserviceDetailList.push({
                                                    SubServiceId: Element.Id, Charges: serviceDetail[1], TypeBit: serviceDetail[2],
                                                    DiscountType: null, DiscountRate: null, TotalCharges: serviceDetail[1], PaidAmount: 0, IsUrgent: 0, ExecutionDateTime: null, UrgentDateTime: null, GovernmentCharges: Element.GovernmentCharges
                                                })
                                                window.SubServicesTotal = parseInt(window.SubServicesTotal) + parseInt(Utilities.IsNotUndefinedOrNull(serviceDetail[1]) ? serviceDetail[1] : &quot;0&quot;);
                                                $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val()) ? $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val() : &quot;0&quot;) + parseInt(Utilities.IsNotUndefinedOrNull(serviceDetail[1]) ? serviceDetail[1] : &quot;0&quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                                
                                                //window.SumOFExcludedAmount = parseInt(window.SumOFExcludedAmount == undefined || window.SumOFExcludedAmount == null ? 0 : window.SumOFExcludedAmount) + parseInt(Utilities.IsNotUndefinedOrNull(Element.GovernmentCharges) ? Element.GovernmentCharges : &quot;0&quot;);
                                            })
                                            $(&quot; , &quot;'&quot; , &quot;#TemplateLabelFields&quot; , &quot;'&quot; , &quot;).show();
                                            $(&quot; , &quot;'&quot; , &quot;.TemplateParent&quot; , &quot;'&quot; , &quot;).show();

                                            if (DiscountData &amp;&amp; DiscountData.PackageGroupDiscountRate &amp;&amp; parseFloat(DiscountData.PackageGroupDiscountRate) > 0) {
                                                $(&quot;#LDyes&quot;).prop(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;, true);
                                                $(&quot; , &quot;'&quot; , &quot;#LDyes&quot; , &quot;'&quot; , &quot;).change();
                                                if (DiscountData.PackageGroupDiscountType == 1) {
                                                    $(&quot;#LDAm&quot;).prop(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;, true);

                                                }
                                                $(&quot;#LDDiscount&quot;).val(DiscountData.PackageGroupDiscountRate);
                                                $(&quot;#LDDiscount&quot;).keyup();
                                            }
                                        }

                                        return false;
                                    }

                                    window.SubServicesTotal = 0;
                                    //window.SumOFExcludedAmount = 0;
                                    //if (window.PackageChanged) {
                                    //    window.SubServicesTotal = parseInt($(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;))
                                    //}
                                    window.MiscSubServicesTotal = 0;
                                    window.serviceDetailList = [];
                                    window.SubserviceDetailList = [];
                                    if ($(&quot; , &quot;'&quot; , &quot;input[name=CheckInTypeId][id=Services]&quot; , &quot;'&quot; , &quot;).is(&quot; , &quot;'&quot; , &quot;:checked&quot; , &quot;'&quot; , &quot;))
                                    {
                                        window.ServiceIds = [];
                                    }
                                    
                                    if ($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val() != &quot;&quot; &amp;&amp; $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val() != null) {
                                        //if (!window.PackageChanged)
                                        //{
                                        $(&quot; , &quot;'&quot; , &quot;.Pocket&quot; , &quot;'&quot; , &quot;).empty();
                                        //}

                                        if (Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;)) &amp;&amp; $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).val() != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
                                            AddDynamicFields(1, $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val(), $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text(), false, $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;ChargeTypeName&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;ChargeIntervalName&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;IntervalDuration&quot; , &quot;'&quot; , &quot;)); // Creating field for selected options 1= &quot;added field in
                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val($(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                            window.SubServicesTotal = parseInt($(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;))
                                        }
                                        //if ($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text() == &quot; , &quot;'&quot; , &quot;Emergency&quot; , &quot;'&quot; , &quot; || $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text() == &quot; , &quot;'&quot; , &quot;Consultation&quot; , &quot;'&quot; , &quot;) {
                                        //    window.IsdynamicCreated = true;

                                        //    AddDynamicFields(1, $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val(), $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text(), false, $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;ChargeTypeName&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;ChargeIntervalName&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;IntervalDuration&quot; , &quot;'&quot; , &quot;)); // Creating field for selected options 1= &quot;added field in
                                        //    window.ServiceIds[1] = $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val();
                                        //    CreateEventfordynamicfield();  // Creating event for dynamic fields Dynamcic fields
                                        //    AddValidations();

                                        //    $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;)) ? $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;) : &quot;0&quot;))
                                        //}
                                        //else {
                                            var i = 0;
                                        $(&quot; , &quot;'&quot; , &quot;#SubServicesId option:selected&quot; , &quot;'&quot; , &quot;).each(function (Index, Element) {

                                            var selecteddata = $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).select2(&quot; , &quot;'&quot; , &quot;data&quot; , &quot;'&quot; , &quot;)[Index];
                                            var charges = 0;
                                                i = i + 1;
                                            if (selecteddata &amp;&amp; selecteddata.Name) {
                                                charges = selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[1];
                                            }

                                            $(&quot;#divSrno&quot;).show();
                                            $(&quot;#divCode&quot;).show();
                                            $(&quot;#divUrgent&quot;).show();
                                            $(&quot;#divTUrgent&quot;).show();
                                            $(&quot;#divTSrno&quot;).show();
                                            $(&quot;#divTCode&quot;).show();
                                            $(&quot;#DivService&quot;).removeClass(&quot; , &quot;'&quot; , &quot;offset-3&quot; , &quot;'&quot; , &quot;);
                                            $(&quot;#DivTService&quot;).removeClass(&quot; , &quot;'&quot; , &quot;offset-3&quot; , &quot;'&quot; , &quot;);
                                                AddDynamicFields(1, $(Element).val(), charges, selecteddata.SubServices, false, selecteddata.ChargeTypeName, selecteddata.ChargeIntervalName, selecteddata.IntervalDuration, selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[2], selecteddata.DeliveryDateTime, selecteddata.Code, i, selecteddata.UrgentDateTime); // Creating field for selected options 1= &quot;added field in
                                            window.SubserviceDetailList.push({
                                                SubServiceId: $(Element).val(), Charges: charges, TypeBit: selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[2],
                                                    DiscountType: null, DiscountRate: null, TotalCharges: charges, PaidAmount: 0, IsUrgent: 0,
                                                    ExecutionDateTime: moment(selecteddata.DeliveryDateTime), UrgentDateTime: null, GovernmentCharges: selecteddata.GovernmentCharges

                                            })

                                            window.SubServicesTotal = parseInt(window.SubServicesTotal) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;);
                                             
                                            //window.SumOFExcludedAmount = parseInt(window.SumOFExcludedAmount == undefined || window.SumOFExcludedAmount == null ? 0 : window.SumOFExcludedAmount) + parseInt(Utilities.IsNotUndefinedOrNull(selecteddata.GovernmentCharges) ? selecteddata.GovernmentCharges : 0);


                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val()) ? $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val() : &quot;0&quot;) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)



                                        })
                                        $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(window.SubServicesTotal) - parseInt(window.MiscSubServicesTotal)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                        //}
                                    }
                                    else {
                                        if ($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text() == &quot; , &quot;'&quot; , &quot;Emergency&quot; , &quot;'&quot; , &quot; || $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text() == &quot; , &quot;'&quot; , &quot;Consultation&quot; , &quot;'&quot; , &quot;) {
                                            window.IsdynamicCreated = false;
                                            $(&quot; , &quot;'&quot; , &quot;.Pocket&quot; , &quot;'&quot; , &quot;).empty();
                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val()) ? $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val() : &quot;0&quot;) - parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;)) ? $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;) : &quot;0&quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                            RemoveValidation();
                                            $(&quot; , &quot;'&quot; , &quot;#TemplateLabelFields&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;hide&quot; , &quot;'&quot; , &quot;);
                                            window.ServiceIds = []
                                        }
                                        else if ($(&quot; , &quot;'&quot; , &quot;input[name=CheckInTypeId][id=Services]&quot; , &quot;'&quot; , &quot;).is(&quot; , &quot;'&quot; , &quot;:checked&quot; , &quot;'&quot; , &quot;)) {
                                            debugger
                                            if (window.SubserviceDetailList != null &amp;&amp; window.SubserviceDetailList != &quot;&quot;) {
                                                window.SubserviceDetailList = window.SubserviceDetailList.filter(function (x) { return x.SubServiceId !== $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val(); });
                                            }

                                            window.SubServicesTotal = window.SubServicesTotal - parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;)) ? $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;) : &quot;0&quot;);

                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val()) ? $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val() : &quot;0&quot;) - parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;)) ? $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;) : &quot;0&quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)

                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(window.SubServicesTotal) - parseInt(window.MiscSubServicesTotal)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                        }

                                    }
                                    // $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).selectpicker(&quot; , &quot;'&quot; , &quot;refresh&quot; , &quot;'&quot; , &quot;);

                                    if ($(&quot;#LDyes&quot;).prop(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;) == true)
                                    {
                                        $(&quot;#LDDiscount&quot;).keyup();
                                    }
                                })


                            })
                            
                        Please Select a Services&quot;) or . = concat(&quot;
                            
                            

                            $(document).ready(function () {

                                $(&quot; , &quot;'&quot; , &quot;#DepartmentId option&quot; , &quot;'&quot; , &quot;).each(function (Index, Element) {
                                    var attributes = $(Element).text().split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;);
                                    $(Element).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;, attributes[1])
                                    $(Element).attr(&quot; , &quot;'&quot; , &quot;IsInPatient&quot; , &quot;'&quot; , &quot;, attributes[2])
                                    $(Element).attr(&quot; , &quot;'&quot; , &quot;ConsultancyServiceId&quot; , &quot;'&quot; , &quot;, attributes[3])
                                    $(Element).text(attributes[0])

                                    $(&quot; , &quot;'&quot; , &quot;#DepartmentId&quot; , &quot;'&quot; , &quot;).selectpicker(&quot; , &quot;'&quot; , &quot;refresh&quot; , &quot;'&quot; , &quot;);

                                });

                                window.SubServicesTotal = 0;
                                window.MiscSubServicesTotal = 0;
                                //window.SumOFExcludedAmount = 0;
                                window.SubserviceDetailList = [];
                                window.IsdynamicCreated = false;
                                window.ServiceIds = []
                                $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).on(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;, function () {
                                    window.SubserviceDetailList=[]
                                    if ($(&quot;#PackageGroupId&quot;).val() != &quot;&quot; &amp;&amp; window.PackageGroupServicesData &amp;&amp; window.PackageGroupServicesData.length > 0) {
                                        $(&quot; , &quot;'&quot; , &quot;.Pocket&quot; , &quot;'&quot; , &quot;).empty();
                                        $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;);

                                        $(&quot; , &quot;'&quot; , &quot;#PatientCheckInForm&quot; , &quot;'&quot; , &quot;).bootstrapValidator(&quot; , &quot;'&quot; , &quot;enableFieldValidators&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;SubServicesId&quot; , &quot;'&quot; , &quot;, false);
                                        $(&quot; , &quot;'&quot; , &quot;#SubServicesId option:selected&quot; , &quot;'&quot; , &quot;).each(function (Index, Element) {
                                            if (window.PackageGroupServicesData &amp;&amp; window.PackageGroupServicesData.length > 0) {
                                                var selectedresult = window.PackageGroupServicesData.find(obj => {
                                                    return obj.Id === $(Element).val()
                                                });
                                                if (selectedresult &amp;&amp; selectedresult.Id) {
                                                    return false;
                                                }
                                            }
                                            var charges = 0;
                                            var selecteddata = $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).select2(&quot; , &quot;'&quot; , &quot;data&quot; , &quot;'&quot; , &quot;)[Index];
                                            if (selecteddata &amp;&amp; selecteddata.Name) {
                                                charges = selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[1];
                                            }

                                            AddDynamicFields(1, $(Element).val(), charges, $(Element).text(), false, selecteddata.ChargeTypeName, selecteddata.ChargeIntervalName, selecteddata.IntervalDuration, selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[2], selecteddata.DeliveryDateTime);

                                            window.SubserviceDetailList.push({
                                                SubServiceId: $(Element).val(), Charges: charges, TypeBit: selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[2],
                                                DiscountType: null, DiscountRate: null, TotalCharges: charges, PaidAmount: 0, IsUrgent: 0, ExecutionDateTime: null, UrgentDateTime: null, GovernmentCharges: selecteddata.GovernmentCharges
                                            })
                                            window.SubServicesTotal = parseInt(window.SubServicesTotal) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;);
                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val()) ? $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val() : &quot;0&quot;) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                             
                                            //window.SumOFExcludedAmount = parseInt(window.SumOFExcludedAmount == undefined || window.SumOFExcludedAmount == null ? 0 : window.SumOFExcludedAmount) + parseInt(Utilities.IsNotUndefinedOrNull(selecteddata.GovernmentCharges) ? selecteddata.GovernmentCharges : &quot;0&quot;);
                                        });

                                        if (window.PackageGroupServicesData &amp;&amp; window.PackageGroupServicesData.length > 0) {

                                            DiscountData = window.PackageGroupServicesData[0];
                                            $(&quot; , &quot;'&quot; , &quot;#PatientCheckInForm&quot; , &quot;'&quot; , &quot;).bootstrapValidator(&quot; , &quot;'&quot; , &quot;enableFieldValidators&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;SubServicesId&quot; , &quot;'&quot; , &quot;, false);

                                            $(window.PackageGroupServicesData).each(function (Index, Element) {
                                                var servicename = &quot;&quot;;
                                                var serviceDetail = Element.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;);
                                                if (serviceDetail[0]) {
                                                    servicename = serviceDetail[0].split(&quot; , &quot;'&quot; , &quot;--&quot; , &quot;'&quot; , &quot;)[1]
                                                }
                                                AddDynamicFields(1, Element.Id, serviceDetail[1], servicename, false, Element.ChargeTypeName, Element.ChargeIntervalName, Element.IntervalDuration, serviceDetail[2], Element.DeliveryDateTime); // Creating field for selected options 1= &quot;added field in
                                                window.SubserviceDetailList.push({
                                                    SubServiceId: Element.Id, Charges: serviceDetail[1], TypeBit: serviceDetail[2],
                                                    DiscountType: null, DiscountRate: null, TotalCharges: serviceDetail[1], PaidAmount: 0, IsUrgent: 0, ExecutionDateTime: null, UrgentDateTime: null, GovernmentCharges: Element.GovernmentCharges
                                                })
                                                window.SubServicesTotal = parseInt(window.SubServicesTotal) + parseInt(Utilities.IsNotUndefinedOrNull(serviceDetail[1]) ? serviceDetail[1] : &quot;0&quot;);
                                                $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val()) ? $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val() : &quot;0&quot;) + parseInt(Utilities.IsNotUndefinedOrNull(serviceDetail[1]) ? serviceDetail[1] : &quot;0&quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                                
                                                //window.SumOFExcludedAmount = parseInt(window.SumOFExcludedAmount == undefined || window.SumOFExcludedAmount == null ? 0 : window.SumOFExcludedAmount) + parseInt(Utilities.IsNotUndefinedOrNull(Element.GovernmentCharges) ? Element.GovernmentCharges : &quot;0&quot;);
                                            })
                                            $(&quot; , &quot;'&quot; , &quot;#TemplateLabelFields&quot; , &quot;'&quot; , &quot;).show();
                                            $(&quot; , &quot;'&quot; , &quot;.TemplateParent&quot; , &quot;'&quot; , &quot;).show();

                                            if (DiscountData &amp;&amp; DiscountData.PackageGroupDiscountRate &amp;&amp; parseFloat(DiscountData.PackageGroupDiscountRate) > 0) {
                                                $(&quot;#LDyes&quot;).prop(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;, true);
                                                $(&quot; , &quot;'&quot; , &quot;#LDyes&quot; , &quot;'&quot; , &quot;).change();
                                                if (DiscountData.PackageGroupDiscountType == 1) {
                                                    $(&quot;#LDAm&quot;).prop(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;, true);

                                                }
                                                $(&quot;#LDDiscount&quot;).val(DiscountData.PackageGroupDiscountRate);
                                                $(&quot;#LDDiscount&quot;).keyup();
                                            }
                                        }

                                        return false;
                                    }

                                    window.SubServicesTotal = 0;
                                    //window.SumOFExcludedAmount = 0;
                                    //if (window.PackageChanged) {
                                    //    window.SubServicesTotal = parseInt($(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;))
                                    //}
                                    window.MiscSubServicesTotal = 0;
                                    window.serviceDetailList = [];
                                    window.SubserviceDetailList = [];
                                    if ($(&quot; , &quot;'&quot; , &quot;input[name=CheckInTypeId][id=Services]&quot; , &quot;'&quot; , &quot;).is(&quot; , &quot;'&quot; , &quot;:checked&quot; , &quot;'&quot; , &quot;))
                                    {
                                        window.ServiceIds = [];
                                    }
                                    
                                    if ($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val() != &quot;&quot; &amp;&amp; $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val() != null) {
                                        //if (!window.PackageChanged)
                                        //{
                                        $(&quot; , &quot;'&quot; , &quot;.Pocket&quot; , &quot;'&quot; , &quot;).empty();
                                        //}

                                        if (Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;)) &amp;&amp; $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).val() != &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;) {
                                            AddDynamicFields(1, $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val(), $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text(), false, $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;ChargeTypeName&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;ChargeIntervalName&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;IntervalDuration&quot; , &quot;'&quot; , &quot;)); // Creating field for selected options 1= &quot;added field in
                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val($(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                            window.SubServicesTotal = parseInt($(&quot; , &quot;'&quot; , &quot;#IndividualPackageId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;))
                                        }
                                        //if ($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text() == &quot; , &quot;'&quot; , &quot;Emergency&quot; , &quot;'&quot; , &quot; || $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text() == &quot; , &quot;'&quot; , &quot;Consultation&quot; , &quot;'&quot; , &quot;) {
                                        //    window.IsdynamicCreated = true;

                                        //    AddDynamicFields(1, $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val(), $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text(), false, $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;ChargeTypeName&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;ChargeIntervalName&quot; , &quot;'&quot; , &quot;), $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;IntervalDuration&quot; , &quot;'&quot; , &quot;)); // Creating field for selected options 1= &quot;added field in
                                        //    window.ServiceIds[1] = $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val();
                                        //    CreateEventfordynamicfield();  // Creating event for dynamic fields Dynamcic fields
                                        //    AddValidations();

                                        //    $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;)) ? $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;) : &quot;0&quot;))
                                        //}
                                        //else {
                                            var i = 0;
                                        $(&quot; , &quot;'&quot; , &quot;#SubServicesId option:selected&quot; , &quot;'&quot; , &quot;).each(function (Index, Element) {

                                            var selecteddata = $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).select2(&quot; , &quot;'&quot; , &quot;data&quot; , &quot;'&quot; , &quot;)[Index];
                                            var charges = 0;
                                                i = i + 1;
                                            if (selecteddata &amp;&amp; selecteddata.Name) {
                                                charges = selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[1];
                                            }

                                            $(&quot;#divSrno&quot;).show();
                                            $(&quot;#divCode&quot;).show();
                                            $(&quot;#divUrgent&quot;).show();
                                            $(&quot;#divTUrgent&quot;).show();
                                            $(&quot;#divTSrno&quot;).show();
                                            $(&quot;#divTCode&quot;).show();
                                            $(&quot;#DivService&quot;).removeClass(&quot; , &quot;'&quot; , &quot;offset-3&quot; , &quot;'&quot; , &quot;);
                                            $(&quot;#DivTService&quot;).removeClass(&quot; , &quot;'&quot; , &quot;offset-3&quot; , &quot;'&quot; , &quot;);
                                                AddDynamicFields(1, $(Element).val(), charges, selecteddata.SubServices, false, selecteddata.ChargeTypeName, selecteddata.ChargeIntervalName, selecteddata.IntervalDuration, selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[2], selecteddata.DeliveryDateTime, selecteddata.Code, i, selecteddata.UrgentDateTime); // Creating field for selected options 1= &quot;added field in
                                            window.SubserviceDetailList.push({
                                                SubServiceId: $(Element).val(), Charges: charges, TypeBit: selecteddata.Name.split(&quot; , &quot;'&quot; , &quot;;&quot; , &quot;'&quot; , &quot;)[2],
                                                    DiscountType: null, DiscountRate: null, TotalCharges: charges, PaidAmount: 0, IsUrgent: 0,
                                                    ExecutionDateTime: moment(selecteddata.DeliveryDateTime), UrgentDateTime: null, GovernmentCharges: selecteddata.GovernmentCharges

                                            })

                                            window.SubServicesTotal = parseInt(window.SubServicesTotal) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;);
                                             
                                            //window.SumOFExcludedAmount = parseInt(window.SumOFExcludedAmount == undefined || window.SumOFExcludedAmount == null ? 0 : window.SumOFExcludedAmount) + parseInt(Utilities.IsNotUndefinedOrNull(selecteddata.GovernmentCharges) ? selecteddata.GovernmentCharges : 0);


                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val()) ? $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val() : &quot;0&quot;) + parseInt(Utilities.IsNotUndefinedOrNull(charges) ? charges : &quot;0&quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)



                                        })
                                        $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(window.SubServicesTotal) - parseInt(window.MiscSubServicesTotal)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                        //}
                                    }
                                    else {
                                        if ($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text() == &quot; , &quot;'&quot; , &quot;Emergency&quot; , &quot;'&quot; , &quot; || $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).text() == &quot; , &quot;'&quot; , &quot;Consultation&quot; , &quot;'&quot; , &quot;) {
                                            window.IsdynamicCreated = false;
                                            $(&quot; , &quot;'&quot; , &quot;.Pocket&quot; , &quot;'&quot; , &quot;).empty();
                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val()) ? $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val() : &quot;0&quot;) - parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;)) ? $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;) : &quot;0&quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                            RemoveValidation();
                                            $(&quot; , &quot;'&quot; , &quot;#TemplateLabelFields&quot; , &quot;'&quot; , &quot;).addClass(&quot; , &quot;'&quot; , &quot;hide&quot; , &quot;'&quot; , &quot;);
                                            window.ServiceIds = []
                                        }
                                        else if ($(&quot; , &quot;'&quot; , &quot;input[name=CheckInTypeId][id=Services]&quot; , &quot;'&quot; , &quot;).is(&quot; , &quot;'&quot; , &quot;:checked&quot; , &quot;'&quot; , &quot;)) {
                                            debugger
                                            if (window.SubserviceDetailList != null &amp;&amp; window.SubserviceDetailList != &quot;&quot;) {
                                                window.SubserviceDetailList = window.SubserviceDetailList.filter(function (x) { return x.SubServiceId !== $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).val(); });
                                            }

                                            window.SubServicesTotal = window.SubServicesTotal - parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;)) ? $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;) : &quot;0&quot;);

                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val()) ? $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val() : &quot;0&quot;) - parseInt(Utilities.IsNotUndefinedOrNull($(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;)) ? $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).find(&quot; , &quot;'&quot; , &quot;option:selected&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;Charges&quot; , &quot;'&quot; , &quot;) : &quot;0&quot;)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)

                                            $(&quot; , &quot;'&quot; , &quot;#Total&quot; , &quot;'&quot; , &quot;).val(parseInt(window.SubServicesTotal) - parseInt(window.MiscSubServicesTotal)).trigger(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;)
                                        }

                                    }
                                    // $(&quot; , &quot;'&quot; , &quot;#SubServicesId&quot; , &quot;'&quot; , &quot;).selectpicker(&quot; , &quot;'&quot; , &quot;refresh&quot; , &quot;'&quot; , &quot;);

                                    if ($(&quot;#LDyes&quot;).prop(&quot; , &quot;'&quot; , &quot;checked&quot; , &quot;'&quot; , &quot;) == true)
                                    {
                                        $(&quot;#LDDiscount&quot;).keyup();
                                    }
                                })


                            })
                            
                        Please Select a Services&quot;))]</value>
      <webElementGuid>cb07bf96-0157-4281-b900-1961874ce4a8</webElementGuid>
   </webElementXpaths>
</WebElementEntity>

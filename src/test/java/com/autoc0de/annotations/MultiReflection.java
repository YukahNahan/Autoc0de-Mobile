package com.autoc0de.annotations;


import com.autoc0de.exceptions.InexistentAnnotationException;
import io.github.classgraph.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiReflection {

    public static class Builder {

        public Builder scanPackages(String packages) {
            ScanResult result = new ClassGraph()
                                .enableClassInfo()
                                .enableAnnotationInfo()
                                .enableFieldInfo()
                                .whitelistPackages(packages)
                                .scan();
                classInfoList = result.getAllClasses();
            return this;
        }

        public Builder withAnnotationReveal(String descriptorKey) {
            this.descriptorKey = descriptorKey;
            return this;
        }

        public Builder withFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }

        public Builder scanFields() {
            if (classInfoList == null) throw new RuntimeException("scanPackages() el metodo es mandatorio");
            classInfoList.forEach(classInfo -> fieldInfoList.put(classInfo, classInfo.getFieldInfo()));
            return this;
        }

//        public String build() throws IllegalAccessException {
//            if (descriptorKey == null && fieldName == null) {
//                throw new RuntimeException("anotacion o nombre de campo requerido");
//            }
//
//            return defaultResolver();
//        }

//        private String defaultResolver() throws IllegalAccessException {
//            boolean isPresent = false;
//            for (Map.Entry<Object, Object> fInfoList: fieldInfoList.entrySet()) {
//                for (FieldInfo fieldInfo: fInfoList.getValue()) {
//                    isPresent = (descriptorKey == null) ? variableResolver(fieldInfo) : annotationResolver(fieldInfo);
//                    if (isPresent) return (String) fieldInfo.loadClassAndGetField().get(fInfoList.getKey());
//                }
//            }
//
//            throw new InexistentAnnotationException(descriptorKey);
//        }

        private boolean annotationResolver(FieldInfo fieldInfo) {
            List<AnnotationInfo> annotationStringsList = new ArrayList<>(fieldInfo.getAnnotationInfo());

            return annotationStringsList.stream()
                    .anyMatch(
                            annotationInfo -> annotationInfo.getParameterValues().stream()
                                    .anyMatch(annotationValue -> annotationValue.getValue().equals(descriptorKey))
                    );
        }

        private boolean variableResolver(FieldInfo fieldInfo) {
            return fieldInfo.getName().equals(fieldName);
        }

        private Map<Object, Object> fieldInfoList = new HashMap<Object, Object>();
        private ClassInfoList classInfoList                 = null;
        private String descriptorKey                        = null;
        private String fieldName                            = null;

    }

    private MultiReflection() {}

}
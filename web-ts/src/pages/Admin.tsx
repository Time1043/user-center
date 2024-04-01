import {PageContainer} from '@ant-design/pro-components';
import '@umijs/max';
import React from 'react';

const Admin: React.FC = (props) => {
  // @ts-ignore
  const {children} = props;
  return (
    <PageContainer content={' admin 权限'}>
      {children}
    </PageContainer>
  );
};
export default Admin;

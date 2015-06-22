package com.aro.framework.Services;

interface IService
{
    /// <summary>
    /// 服务名称
    /// </summary>
    String getName();

    /// <summary>
    /// 服务是否正在运行
    /// </summary>
    boolean getRunning();

    /// <summary>
    /// 启动服务
    /// </summary>
    void Start();

    /// <summary>
    /// 停止服务
    /// </summary>
    void Stop();
}

